package Classes;

import java.util.ArrayList;
import java.util.List;

public class Paragraph extends Element{
    private String text;
    private List<Element> elements;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print(){
        System.out.println("Paragraph: " + this.text);
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
}
