package com.example.designpatternslab2023.models;

import com.example.designpatternslab2023.services.AlignStrategy;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends Element implements Visitee{
    private String text;
    private List<Element> elements;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        elements = new ArrayList<>();
    }

    public String getText(){
        return this.text;
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

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }



    @Override
    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render("Paragraph: " + this.text); // Render the text with alignment
        } else {
            System.out.println("Paragraph: " + this.text);
        }

        for (Element element : elements) {
            element.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
       visitor.visitParagraph(this);
    }
}
