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
        SpringApplication.run(DesignPatternsLab2023Application.class, args);
    }
}
