package com.example.elasticsearchdemo.repository;

import com.example.elasticsearchdemo.model.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

}
