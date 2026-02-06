package com.github.bernabaris.backend.mapper;

import com.github.bernabaris.backend.entity.LanguageEntity;
import com.github.bernabaris.backend.model.Language;

public class LanguageMapper {
    public static Language toModel(LanguageEntity entity) {
        if (entity == null) return null;

        return new Language(
                entity.getId(),
                entity.getName()
        );
    }
}
