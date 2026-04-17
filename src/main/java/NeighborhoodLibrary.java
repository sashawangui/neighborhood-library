import java.util.ArrayList;
import java.util.Collections;

public class NeighborhoodLibrary {
    public static void main(String[] args){
        //create my array list to store books
        ArrayList<Book> library = new ArrayList<>();

        //add at least 20 books
        Collections.addAll(library, new Book(1,  "The Hitchhiker's Guide to the Galaxy", "978-0-330-25864-8"),
        new Book(2,  "1984",                                  "978-0-451-52493-5"),
        new Book(3,  "To Kill a Mockingbird",                 "978-0-06-112008-4"),
        new Book(4,  "The Great Gatsby",                      "978-0-7432-7356-5"),
        new Book(5,  "Brave New World",                       "978-0-06-092987-6"),
        new Book(6,  "The Catcher in the Rye",               "978-0-316-76948-0"),
        new Book(7,  "Pride and Prejudice",                   "978-0-14-143951-8"),
        new Book(8,  "The Lord of the Rings",                 "978-0-618-64015-7"),
        new Book(9,  "Harry Potter and the Philosopher's Stone", "978-0-7475-3269-9"),
        new Book(10, "The Alchemist",                         "978-0-06-231609-7"),
        new Book(11, "Crime and Punishment",                  "978-0-14-044913-6"),
        new Book(12, "The Hobbit",                            "978-0-618-00221-3"),
        new Book(13, "Moby-Dick",                             "978-0-14-243723-9"),
        new Book(14, "Jane Eyre",                             "978-0-14-144114-6"),
        new Book(15, "Dune",                                  "978-0-441-17271-9"),
        new Book(16, "The Da Vinci Code",                     "978-0-385-50420-5"),
        new Book(17, "The Hunger Games",                      "978-0-439-02352-8"),
        new Book(18, "Animal Farm",                           "978-0-452-28424-1"),
        new Book(19, "Fahrenheit 451",                        "978-1-4516-7331-9"),
        new Book(20, "The Shining",                           "978-0-385-12167-5"));

        System.out.println("Print out all the ");
    }
}
