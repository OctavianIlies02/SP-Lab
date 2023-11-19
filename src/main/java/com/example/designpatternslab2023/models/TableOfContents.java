package com.example.designpatternslab2023.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents extends Element implements Visitee {

    private List<Element> elements = new ArrayList<>();
    @Getter
    private List<String> entries = new ArrayList<>();

    @Override
    public void add(Element e) {
        elements.add(e);
    }

    @Override
    public void remove(Element e) {
        elements.remove(e);
    }

    @Override
    public Element get(int index) {
        return elements.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }

    public List<Element> getElements() {
        return elements;
    }

    public void addEntry(String entry){
        entries.add(entry);
    }

}
