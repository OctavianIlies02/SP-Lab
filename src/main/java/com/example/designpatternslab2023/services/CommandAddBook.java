package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.models.Book;

public class CommandAddBook implements Command<Book>{
    private BookServices books;
    private Book newBook;

    @Override
    public Book execute() {
        return books.createBook(newBook);
    }

    public CommandAddBook(BookServices contextbooks){
        this.books = contextbooks;
    }

    public void setAtribute(Book newBook){
        this.newBook = newBook;
    }
}
