package com.github.bernabaris.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "language")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LanguageEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "language")
    private List<MovieEntity> movies;

    @Override
    public String toString() {
        return "LanguageEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
