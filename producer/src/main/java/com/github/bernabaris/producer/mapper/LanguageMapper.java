package com.github.bernabaris.producer.mapper;

import com.github.bernabaris.producer.entity.LanguageEntity;
import com.github.bernabaris.producer.model.Language;

public class LanguageMapper {
    public static Language toModel(LanguageEntity entity) {
        if (entity == null) return null;

        return new Language(
                entity.getId(),
                entity.getName()
        );
    }
}
