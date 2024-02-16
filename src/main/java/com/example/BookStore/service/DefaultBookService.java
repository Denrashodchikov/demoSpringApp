package com.example.BookStore.service;

import com.example.BookStore.dao.BookEntity;
import com.example.BookStore.exception.BookNotFoundException;
import com.example.BookStore.mapper.BookToEntityMapper;
import com.example.BookStore.model.Book;
import com.example.BookStore.dao.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class DefaultBookService implements BookService {
    private final BookRepository bookRepository;
    private final BookToEntityMapper mapper;

    @Override
    public Book getBookById(Long id) {
        BookEntity bookEntity = bookRepository
                .findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found: id = " + id));

        return mapper.bookEntityToBook(bookEntity);
    }

    @Override
    public List<Book> getAllBooks() {
        Iterable<BookEntity> iterable = bookRepository.findAll();
        ArrayList<Book> books = new ArrayList<>();
        for (BookEntity bookEntity : iterable) {
            books.add(mapper.bookEntityToBook(bookEntity));
        }

        return books;
    }

    @Override
    public void addBook(Book book) {
        BookEntity bookEntity = mapper.bookToBookEntity(book);
        bookRepository.save(bookEntity);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        Iterable<BookEntity> iterable = bookRepository.findAllByAuthorContaining(author);
        ArrayList<Book> books = new ArrayList<>();
        for (BookEntity bookEntity : iterable) {
            books.add(mapper.bookEntityToBook(bookEntity));
        }
        return books;
    }
}
