package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.Entity.Book;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandGetBookById implements Command {

    private final Long id;

    Book result = null;

    public void execute(CommandContext context) {
        result = context.getBookRepository().findById(id).get();
    }

    public Book getResultBook() {
        return result;
    }
}