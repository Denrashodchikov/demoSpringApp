package com.example.demoTopProger.repository;

import com.example.demoTopProger.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, Long> {

}
