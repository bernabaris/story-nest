FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

FROM openjdk:17.0.2-slim
WORKDIR /app
COPY --from=build /app/target/backend-0.0.1-SNAPSHOT.jar backend-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "backend-0.0.1-SNAPSHOT.jar"]

ENV SPRING_PROFILES_ACTIVE=prod
EXPOSE 8080