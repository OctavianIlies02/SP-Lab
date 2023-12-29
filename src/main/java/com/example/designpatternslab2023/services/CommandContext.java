package com.example.designpatternslab2023.services;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)

public class CommandContext {

    @Getter
    final private BookServices bookRepository;
}
