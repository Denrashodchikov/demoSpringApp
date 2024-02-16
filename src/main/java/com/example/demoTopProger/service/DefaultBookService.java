package com.example.demoTopProger.service;

import com.example.demoTopProger.entity.BookEntity;
import com.example.demoTopProger.exception.BookNotFoundException;
import com.example.demoTopProger.model.Book;
import com.example.demoTopProger.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class DefaultBookService implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book getBookById(Long id) {
        BookEntity bookEntity = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found: id = " + id));
        return new Book(bookEntity.getId(),
                bookEntity.getAuthor(),
                bookEntity.getTitle(),
                bookEntity.getPrice());
    }

    @Override
    public List<Book> getAllBooks() {
        Iterable<BookEntity> iterable = bookRepository.findAll();

        ArrayList<Book> books = new ArrayList<>();
        for (BookEntity bookEntity :
                iterable) {
            books.add(new Book(bookEntity.getId(), bookEntity.getAuthor(), bookEntity.getTitle(), bookEntity.getPrice()));
        }
        return books;
    }

    @Override
    public void addBook(Book book) {
        BookEntity bookEntity = new BookEntity(null,
                book.getAuthor(),
                book.getTitle(),
                book.getPrice());
        bookRepository.save(bookEntity);
    }
}
