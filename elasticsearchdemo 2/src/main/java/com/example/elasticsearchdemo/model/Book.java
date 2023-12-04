package com.example.elasticsearchdemo.model;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "book_index")
public class Book {
    private Integer id;
    private String title;
    private String author;

}
