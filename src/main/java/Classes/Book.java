package Classes;
import java.util.ArrayList;
import java.util.List;

public class Book extends Section{

    private List<Author> authors;

    public Book(String title) {
        super(title);
        authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

   @Override
    public void print(){
        System.out.println("Book: " + title );
        System.out.println();

        System.out.println("Authors: ");
        for (Author author : authors) {
            author.print();
        }
        System.out.println();

        for (Element e : elements) {
            e.print();
        }
    }
}