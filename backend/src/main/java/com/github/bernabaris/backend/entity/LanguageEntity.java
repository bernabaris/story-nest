package com.github.bernabaris.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.util.List;

@Entity
@Table(name = "language")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "movies")
public class LanguageEntity {

    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "language", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<MovieEntity> movies;
}
