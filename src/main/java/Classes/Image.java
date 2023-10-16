package Classes;

public class Image implements Element{
    public String imageName;

   public Image(String imageName){
        this.imageName = imageName;
    }

    @Override
    public String print(){
        return "Image with name: " + this.imageName;
    }
}
