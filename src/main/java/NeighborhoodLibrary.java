import java.io.*;
import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        //add at least 20 books - added to a CSV file

        //create a home screen
        Scanner input = new Scanner(System.in);
        boolean appOpen = true;
        String fileName = "library.csv";

        while (appOpen) {
            System.out.println("---------Neighborhood Library---------");
            System.out.println("1 - Show Available Books - type A");
            System.out.println("2 - Show Checked out Books - type C");
            System.out.println("3 - Exit - type X");
            System.out.println("Choose an option: ");
            String choice = input.next().toString().trim();


            if (choice.equalsIgnoreCase("a")){
                showAvailableBooks(fileName);
            }

        }
    }
        //Show Available Books and checkout if they want to; otherwise display home page
        public static void showAvailableBooks(String fileName) {
            System.out.println("\n -----------------Available books-----------------");
            System.out.printf("%-5s %-45s %-20s%n", "ID", "Title", "ISBN");
            System.out.println("-".repeat(30));

            try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
                br.readLine();
                String line;
                while ((line = br.readLine()) != null){
                    String[] values = line.split(",");

                    int id = Integer.parseInt(values[0].trim());
                    String title = values[1].trim();
                    String isbn = values[2].trim();

                    System.out.printf("%-5d %-45s %-20s%n", id, title, isbn);
                }
            }catch(Exception e){
                System.out.println("Error: "+ e.getMessage().toString());
            }
            }
        }

    //


//    //checkout books method.
//    public static void checkOutBook(ArrayList<Book> library, int id, String title, String isbn){
//        //ask who to check out to assign the name
//        Scanner input  = new Scanner(System.in);
//        System.out.println("Who do we check this out to?");
//        String name = input.nextLine();
//
//        for (Book book : library){
//          if (book.getId() == id){
//              book.checkOut(name);
//              System.out.println(book + " has been checked out to" + name );
//            }
//
//        }
//    }
//
//
//}
