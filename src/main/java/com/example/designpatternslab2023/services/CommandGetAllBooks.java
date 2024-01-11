package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.Entity.Book;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CommandGetAllBooks implements Command {
    List<Book> result;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().findAll();
    }

    public List<Book> getResults() {
        return result;
    }
}
