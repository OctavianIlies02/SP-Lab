package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.models.Book;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandUpdateBook implements Command {

    private final Long id;
    private final Book book;
    Book result;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().createBook(book);
    }

    public Book getResults() {
        return result;
    }
}
