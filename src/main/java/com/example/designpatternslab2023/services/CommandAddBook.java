package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.models.Book;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class CommandAddBook implements Command {

    Book result;

    private final Map<String, Object> request;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().createBook(new Book((String) request.get("Titlu")));
    }

    public Book getResults() {
        return result;
    }
}
