package com.example.demoTopProger.dao;

import com.example.demoTopProger.dao.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, Long> {

}
