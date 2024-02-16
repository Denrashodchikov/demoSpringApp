package com.example.BookStore.service;

import com.example.BookStore.model.Book;

import java.util.List;

public interface BookService {
    Book getBookById(Long id);// получить книгу по id
    List<Book> getAllBooks();// получить список всех книг
    List<Book> findByAuthor(String author);// получить список всех книг
    void addBook(Book book);// добавить книгу
}