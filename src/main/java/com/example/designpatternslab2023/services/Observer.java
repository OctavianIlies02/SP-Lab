package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.Entity.Book;

public interface Observer {
    void update(Book b);
}