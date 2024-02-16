package com.example.demoTopProger.mapper;

import com.example.demoTopProger.model.Book;
import com.example.demoTopProger.model.BookRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Book AddBookRequestToBook(BookRequest bookRequest);
}
