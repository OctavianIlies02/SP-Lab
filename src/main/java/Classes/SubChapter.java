package Classes;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Image> images;
    private List<Paragraph> paragraphs;
    private List<Table> tables;

    SubChapter(String name){
        this.name = name;
        this.images = new ArrayList<>();
        this.paragraphs = new ArrayList<>();
        this.tables = new ArrayList<>();
    }

    public void createNewParagraph(String s){
        Paragraph p = new Paragraph(s);
        this.paragraphs.add(p);
    }

    public void createNewImage(String s){
        Image i = new Image(s);
        this.images.add(i);
    }

    public void createNewTable(String s){
        Table t = new Table(s);
        this.tables.add(t);
    }

    public void print(){
        System.out.println("Subchapter: " + this.name);
        for(Paragraph p : paragraphs)
            p.print();
        for(Image i: images)
            i.print();
        for(Table t: tables)
            t.print();
    }
}
