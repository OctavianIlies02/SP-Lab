package Classes;
import java.util.ArrayList;
import java.util.List;
public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

   public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<>();
    }

    public int createSubChapter(String s){
        SubChapter sc = new SubChapter(s);
        this.subChapters.add(sc);
        return this.subChapters.indexOf(sc);
    }

    public SubChapter getSubChapter(int indexSubChapter){
        return this.subChapters.get(indexSubChapter);
    }

    public void print(){
        System.out.println(this.name);
        for(SubChapter sc: subChapters)
            sc.print();
    }


}