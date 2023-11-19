package com.example.designpatternslab2023.services;

import com.example.designpatternslab2023.services.AlignStrategy;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println("#" + text + "#");
    }
}
