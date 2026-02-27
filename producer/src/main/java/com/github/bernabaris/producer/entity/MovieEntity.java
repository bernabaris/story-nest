package com.github.bernabaris.producer.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "movie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "release_year", nullable = false)
    private Integer releaseYear;

    @Column(columnDefinition = "TEXT")
    private String story;

    @Column(name = "base64_img", columnDefinition = "MEDIUMTEXT")
    private String base64Img;

    @ManyToOne(optional = false)
    @JoinColumn(name = "language_id")
    private LanguageEntity language;

    @ManyToOne(optional = false)
    @JoinColumn(name = "genre_id")
    private GenreEntity genre;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private UserEntity createdBy;

    @Column(name = "active")
    private boolean isActive = true;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToOne(mappedBy = "movie", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private RatingEntity rating;

    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ReviewEntity> reviews;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    public void setRating(RatingEntity rating) {
        this.rating = rating;
        rating.setMovie(this);
    }
}
