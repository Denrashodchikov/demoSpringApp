package com.example.BookStore.mapper;

import com.example.BookStore.dao.BookEntity;
import com.example.BookStore.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToEntityMapper {
    BookEntity bookToBookEntity(Book book);
    Book bookEntityToBook(BookEntity bookEntity);
}
