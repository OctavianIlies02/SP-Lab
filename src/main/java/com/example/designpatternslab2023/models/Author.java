package com.example.designpatternslab2023.models;

public class Author implements Visitee{
    private String name;
    private String surname;

    public Author(String name ) {
        this.name = name;
    }

    public Author(String name, String surname){this.name= name; this.surname = surname;}

    public void print(){
        System.out.println("Author: " + name);
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitAuthor(this);
    }
}


