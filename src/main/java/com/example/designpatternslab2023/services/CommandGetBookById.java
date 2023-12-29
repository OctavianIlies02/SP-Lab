package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.models.Book;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class CommandGetBookById implements Command {

    private final Long id;

    Book result = null;

    public void execute(CommandContext context) {
        result = context.getBookRepository().getBookById(id);
    }

    public Book getResultBook() {
        return result;
    }
}