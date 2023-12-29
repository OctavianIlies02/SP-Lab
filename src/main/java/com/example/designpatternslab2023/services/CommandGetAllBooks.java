package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.models.Book;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CommandGetAllBooks implements Command {
    List<Book> result;

    @Override
    public void execute(CommandContext context) {
        result = context.getBookRepository().getBooks();
    }

    public List<Book> getResults() {
        return result;
    }
}
