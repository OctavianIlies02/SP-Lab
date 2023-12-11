package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.models.Book;

public class CommandDeleteBook implements Command<Void>{
    private BookServices books;
    private Long id;

    @Override
    public Void execute() {
        books.deleteBook(id);
        return null;
    }

    public CommandDeleteBook(BookServices contextBooks) {
        this.books = contextBooks;
    }

    public void setAtribute(Long id){
        this.id = id;
    }
}
