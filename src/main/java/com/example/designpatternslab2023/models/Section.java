package com.example.designpatternslab2023.models;

import com.example.designpatternslab2023.models.Element;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Section extends Element implements Visitee{
    @Getter
    protected String title;
    @Getter
    protected List<Element> elements;

    public Section(String title){
        this.title = title;
        elements = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element e: elements)
            e.print();
    }

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
        visitor.visitSection(this);
    }

    public String getTitle(){
        return this.title;
    }

    public List<Element> getElements(){
        return elements;
    }
}
