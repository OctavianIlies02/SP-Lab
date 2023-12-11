package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.models.Book;

import java.util.List;

public class CommandGetAllBooks implements Command<List<Book>>{
    private BookServices books;

    public List<Book> execute() {
        return books.getBooks();
    }
    public CommandGetAllBooks(BookServices contextBooks){
        this.books=contextBooks;
    }

}
