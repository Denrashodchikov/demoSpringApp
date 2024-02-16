package com.example.BookStore.mapper;

import com.example.BookStore.model.Book;
import com.example.BookStore.model.BookRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Book AddBookRequestToBook(BookRequest bookRequest);
}
