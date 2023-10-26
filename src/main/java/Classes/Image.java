package Classes;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image extends Element implements Picture{
    public String imageName;
    public String url;

    @Override
    public void print(){
        System.out.println("Image with name: " + this.url);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    public Image(String url){
       this.url = url;
       try{
           TimeUnit.SECONDS.sleep(5);
       } catch (InterruptedException e){
           e.printStackTrace();
       }
    }

    public Image (Image i){
        url = i.url;
    }

    public Element clone(){
        return new Image(this);
    }
}
