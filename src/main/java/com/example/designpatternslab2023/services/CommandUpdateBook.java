package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.Entity.Book;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandUpdateBook implements Command {

    private final Long id;
    private final Book book;
    Book result;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().save(book);
    }

    public Book getResults() {
        return result;
    }
}
