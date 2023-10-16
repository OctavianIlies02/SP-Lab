package Classes;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Element> elements;

    SubChapter(String name){
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void createNewParagraph(String s){
        Paragraph p = new Paragraph(s);
        this.elements.add(p);
    }

    public void createNewImage(String s){
        Image i = new Image(s);
        this.elements.add(i);
    }

    public void createNewTable(String s){
        Table t = new Table(s);
        this.elements.add(t);
    }

    public void print(){
        System.out.println("Subchapter: " + this.name);
       for(Element e: elements)
           System.out.println(e.print());
    }
}
