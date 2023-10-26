package Classes;

import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.util.StringUtils;

import java.awt.*;

public class ImageProxy extends Element implements Picture {

    private Image realImage;
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

    public Image LoadImage(){
        if(realImage == null)
            realImage = new Image(url);
        return realImage;
    }

    public void print(){
        LoadImage().print();
    }


}
