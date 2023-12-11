package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.models.Book;

public class CommandGetBookById implements Command<Book> {
    private BookServices books;
    private Long id;

    @Override
    public Book execute() {
        return books.getBookById(id);
    }

    public CommandGetBookById(BookServices contextBooks)
    {
        this.books = contextBooks;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
