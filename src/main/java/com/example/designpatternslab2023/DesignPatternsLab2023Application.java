package com.example.designpatternslab2023;


import com.example.designpatternslab2023.Difexamples.*;
import com.example.designpatternslab2023.models.*;
import com.example.designpatternslab2023.services.BookSaveVisitor;
import com.example.designpatternslab2023.services.RenderContentVisitor;
import com.example.designpatternslab2023.services.TableOfContentUpdate;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DesignPatternsLab2023Application {

    public static void main(String[] args) {
        Book b = new Book("The book");
        Section cap1 = new Section("Chapter 1");
        Section cap11 = new Section("Subchapter 1.1");
        Section cap2 = new Section("Chapter 2");
        cap1.add(new Paragraph("Paragraph 1"));
        cap1.add(new Paragraph("Paragraph 2"));
        cap1.add(new Paragraph("Paragraph 3"));
        cap11.add(new ImageProxy("ImageOne"));
        cap11.add(new Image("ImageTwo"));
        cap2.add(new Paragraph("Paragraph 4"));
        cap1.add(cap11);
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        b.add(cap1);
        b.add(cap2);
        BookSaveVisitor saveVisitor = new BookSaveVisitor();
        b.accept(saveVisitor);

    }
}
