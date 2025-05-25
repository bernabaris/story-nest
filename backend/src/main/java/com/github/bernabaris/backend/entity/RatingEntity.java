package com.github.bernabaris.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rating")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatingEntity {
    @Id
    @Column(name = "movie_id")
    private Long movieId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "movie_id")
    private MovieEntity movie;

    @Column(name = "likes")
    private Integer likes;

    @Column(name = "dislikes")
    private Integer dislikes;

    @Column(name = "value_")
    private Double value;

    @Override
    public String toString() {
        return "RatingEntity{" +
                "movieId=" + movieId +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", value=" + value +
                '}';
    }
}
