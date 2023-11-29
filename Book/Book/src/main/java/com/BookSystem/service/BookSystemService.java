package com.BookSystem.service;

import com.BookSystem.entitiy.Book;
import com.BookSystem.repostory.IBook;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BookSystemService {
    @Autowired
    private IBook bookRepository;
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

}
