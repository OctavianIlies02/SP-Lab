package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.models.*;

import java.util.List;

public class BookSaveVisitor implements Visitor<Void> {
    @Override
    public Void visitBook(Book book) {
        System.out.println("{");
        System.out.println("\"Book\": {");
        System.out.println("\"title\": " + "\"" + book.getTitle() + "\",");
        System.out.println("\"Authors\": [");
        for (Author author :
                book.getAuthors()) {
            author.accept(this);
        }
        System.out.println("]");
        if (!book.getElements().isEmpty())
            System.out.print(",");

        List<Element> books = book.getElements();
        printChilds(books);
        System.out.println("}");
        System.out.println("}");
        return null;
    }

    private void printChilds(List<Element> books) {
        for (int i = 0; i < books.size(); i++) {
            books.get(i).accept(this);
            if (i != books.size() - 1) System.out.print(",");
        }
    }

    @Override
    public Void visitSection(Section section) {
        System.out.println("\"Section\": {");
        System.out.println("\"title\": " + "\"" + section.getTitle() + "\"");
        if (!section.getElements().isEmpty())
            System.out.print(",");

        var sections = section.getElements();
        printChilds(sections);
        System.out.println("}");

        return null;
    }

    @Override
    public Void visitTableOfContents(TableOfContents toc) {
        int pageCount = 1;
        System.out.println("\"TableOfContent\" : {");
        for (String entry :
                toc.getEntries()) {
            if (entry != null) System.out.println("\"" + entry + "\"" + ":" + "\"" + pageCount + "\"");
            else pageCount++;
        }
        System.out.println("}");
        return null;
    }

    @Override
    public Void visitParagraph(Paragraph paragraph) {
        System.out.println("\"Paragraph\": {");
        System.out.println("\"text\": " + "\"" + paragraph.getText() + "\"");
        System.out.println("}");
        return null;
    }

    @Override
    public Void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.LoadImage().accept(this);
        return null;
    }

    @Override
    public Void visitImage(Image image) {
        System.out.println("\"Image\": {");
        System.out.println("\"name\": " + "\"" + image.getImageName() + "\"");
        System.out.println("}");
        return null;
    }

    @Override
    public Void visitTable(Table table) {
        System.out.println("\"Table\": {");
        System.out.println("\"title\": " + "\"" + table.getTitle() + "\"");
        System.out.println("}");
        return null;
    }

    public Void visitAuthor(Author author) {
        System.out.println("\"Author\": {");
        System.out.println("\"Author\": " + "\"" + author.getName() + "\"");
        System.out.println("}");
        return null;
    }
}
