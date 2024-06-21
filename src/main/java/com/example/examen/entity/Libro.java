package com.example.examen.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "libro")
public class Libro {
    
    private String title;
    private String isbn; 
    private int pageCount;
    private String thumbnailUrl;
    private String shortDescription;
    private String longDescription;
    private String status;
    private String authors;
    private String categories;
}
