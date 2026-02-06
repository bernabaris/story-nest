package com.github.bernabaris.backend.repository;

import com.github.bernabaris.backend.entity.LanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<LanguageEntity, Long> {
}
