package com.example.designpatternslab2023.models;

import java.awt.*;

public class ImageProxy extends Element implements Picture {

    private com.example.designpatternslab2023.models.Image realImage;
    private String url;
    private Dimension dim;

    public ImageProxy(String url){
        this.url = url;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return dim;
    }

    public com.example.designpatternslab2023.models.Image LoadImage(){
        if(realImage == null)
            realImage = new Image(url);
        return realImage;
    }

    public void print(){
        LoadImage().print();
    }


}
