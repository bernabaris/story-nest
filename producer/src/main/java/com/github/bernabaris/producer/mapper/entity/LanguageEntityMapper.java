package com.github.bernabaris.producer.mapper.entity;

import com.github.bernabaris.producer.entity.LanguageEntity;
import com.github.bernabaris.producer.model.Language;

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
