package Classes;

public class Image implements Element{
    public String imageName;

   public Image(String imageName){
        this.imageName = imageName;
    }

    @Override
    public void print(){
        System.out.println("Image with name: " + this.imageName);
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
}
