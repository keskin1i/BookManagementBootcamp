package com.BookSystem.repostory;

import java.util.List;
import java.util.Optional;

public interface IBook<Book> {

    List<com.BookSystem.entitiy.Book> getAllBooks();

    Optional<Object> getBookById(Long id);

    com.BookSystem.entitiy.Book saveBook(com.BookSystem.entitiy.Book book);

    List<com.BookSystem.entitiy.Book> findAll();

    Optional<com.BookSystem.entitiy.Book> findById(Long id);

    com.BookSystem.entitiy.Book save(com.BookSystem.entitiy.Book book);

    void deleteById(Long id);

    void deleteBook(Long id);
}
