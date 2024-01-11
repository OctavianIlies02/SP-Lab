package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.persistence.AuthorRepository;
import com.example.designpatternslab2023.persistence.BookCrudRepositoryAdapter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)

public class CommandContext {

    @Getter
    final private BookCrudRepositoryAdapter bookRepository;

    @Getter
    final private AuthorRepository authorRepository;
}
