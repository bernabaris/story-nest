package com.github.bernabaris.backend.mapper.entity;

import com.github.bernabaris.backend.entity.LanguageEntity;
import com.github.bernabaris.backend.model.Language;

public class LanguageEntityMapper {

    private LanguageEntityMapper() {
    }

    public static Language toModel(LanguageEntity entity) {
        if (entity == null) return null;

        return new Language(
                entity.getId(),
                entity.getName()
        );
    }
}
