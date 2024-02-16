package com.example.demoTopProger;

import com.example.demoTopProger.mapper.BookToDtoMapper;
import com.example.demoTopProger.model.Book;
import com.example.demoTopProger.model.BookRequest;
import com.example.demoTopProger.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;
    private final BookToDtoMapper mapper;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public void addBook(@RequestBody BookRequest request) {
        bookService.addBook(mapper.AddBookRequestToBook(request));
    }
}