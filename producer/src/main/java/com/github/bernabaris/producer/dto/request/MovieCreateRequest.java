package com.github.bernabaris.producer.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieCreateRequest {

    private String name;
    private Integer releaseYear;
    private String story;
    private String base64Img;

    private Long genreId;
    private Long languageId;
}
