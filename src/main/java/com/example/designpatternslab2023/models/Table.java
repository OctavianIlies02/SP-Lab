package com.example.designpatternslab2023.models;

import com.example.designpatternslab2023.models.Element;

public class Table extends Element implements Visitee{
    private String title;

    public String getTitle() {
        return title;
    }

    public Table(String title){
        this.title = title;
    }

    @Override
    public void print(){
        System.out.println("Table with title: " + this.title);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int index) {
        return null;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
