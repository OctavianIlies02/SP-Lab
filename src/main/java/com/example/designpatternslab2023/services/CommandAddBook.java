package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.Entity.Book;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class CommandAddBook implements Command {

    Book result;

    private final Map<String, Object> request;

    @Override
    public void execute(CommandContext context) {
        Book carte = new Book();
        result = context.getBookRepository().save(carte);
    }

    public Book getResults() {
        return result;
    }
}
