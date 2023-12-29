package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class BookServices {
    private final Map<Long, Book> books = new TreeMap<>();
    private long nextId = 1;

    public Book createBook(Book bookData) {
        long bookId = getNextId();
        books.put(bookId, bookData);
        return books.get(bookId);
    }

    public void updateBook(Long bookId, Book updatedBookData) {
        if (books.containsKey(bookId)) {
            books.put(bookId, updatedBookData);
        }
    }
    public void deleteBook(Long bookId) {
        books.remove(bookId);
    }
    private synchronized long getNextId() {
        return nextId++;
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(Long bookId) {
        return books.get(bookId);
    }


}
