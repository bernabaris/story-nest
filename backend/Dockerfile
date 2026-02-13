# BUILD STAGE
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Copy Nexus certificate
COPY nexus.crt /tmp/nexus.crt

# Import certificate into JVM truststore
RUN keytool -importcert \
    -file /tmp/nexus.crt \
    -alias nexus \
    -keystore $JAVA_HOME/lib/security/cacerts \
    -storepass password \
    -noprompt

# Copy Maven settings (contains Nexus credentials)
COPY settings.xml /root/.m2/settings.xml

# Copy only pom.xml first (better Docker layer caching)
COPY pom.xml .

# Download dependencies in advance (cache optimization)
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build and optionally deploy to Nexus
RUN mvn clean deploy -DskipTests


# ---------- RUNTIME STAGE ----------
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy generated JAR (wildcard prevents version hardcoding)
COPY --from=build /app/target/*.jar app.jar

# Set active Spring profile
ENV SPRING_PROFILES_ACTIVE=prod

# Expose application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
