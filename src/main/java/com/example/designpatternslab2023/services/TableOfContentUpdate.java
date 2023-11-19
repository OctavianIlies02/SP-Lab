package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.models.*;
import lombok.Getter;

public class TableOfContentUpdate implements Visitor<Void> {
    @Getter
    private TableOfContents toC;

    public TableOfContentUpdate() {
        toC = new TableOfContents();
    }

    @Override
    public Void visitBook(Book book) {
        for (Visitee element :
                book.getElements()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Void visitSection(Section section) {
        toC.addEntry(section.getTitle());
        for (Element element :
                section.getElements()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Void visitTableOfContents(TableOfContents tableOfContents) {
        return null;
    }

    @Override
    public Void visitParagraph(Paragraph paragraph) {
        System.out.println("Paragraph: " + paragraph.getText());
        return null;
    }

    @Override
    public Void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.LoadImage().accept(this);
        return null;
    }

    @Override
    public Void visitImage(Image image) {
        toC.addEntry(null);
        return null;
    }

    @Override
    public Void visitTable(Table table) {
        toC.addEntry(null);
        return null;
    }

    @Override
    public Void visitAuthor(Author author) {
        return null;
    }
}
