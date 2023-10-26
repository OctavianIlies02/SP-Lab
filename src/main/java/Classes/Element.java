package Classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Element {

    protected List<Element> elements;

    public Element(){
        this.elements = new ArrayList<>();
    }

    public void print(){};

    public void add(Element e){elements.add(e);};

    public void remove(Element e){elements.remove(e);};

    public Element get(int index){return elements.get(index);};


}
