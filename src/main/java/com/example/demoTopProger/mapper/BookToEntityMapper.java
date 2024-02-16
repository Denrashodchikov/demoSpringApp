package com.example.demoTopProger.mapper;

import com.example.demoTopProger.dao.BookEntity;
import com.example.demoTopProger.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToEntityMapper {
    BookEntity bookToBookEntity(Book book);
    Book bookEntityToBook(BookEntity bookEntity);
}
