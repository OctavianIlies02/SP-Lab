package com.example.designpatternslab2023.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section implements Visitee{
    @Getter
    private List<Author> authors;

    public Book(String title) {
        super(title);
        authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

   @Override
    public void print(){
        System.out.println("Book: " + title );
        System.out.println();

        System.out.println("Authors: ");
        for (Author author : authors) {
            author.print();
        }
        System.out.println();

        for (Element e : elements) {
            e.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }

}