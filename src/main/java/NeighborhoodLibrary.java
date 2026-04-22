import java.io.*;
import java.util.Scanner;

public class NeighborhoodLibrary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean appOpen = true;
        String fileName = "library.csv";

        while (appOpen) {
            System.out.println("---------Neighborhood Library---------");
            System.out.println("1 - Show Available Books - type A");
            System.out.println("2 - Show Checked out Books - type C");
            System.out.println("3 - Exit - type X");
            System.out.println("Choose an option: ");
            String choice = input.next().trim();

            if (choice.equalsIgnoreCase("a")) {
                showAvailableBooks(fileName);

                System.out.println("Would you like to: ");
                System.out.println("1. Checkout a book (Press 1)");
                System.out.println("2. Exit to main page (Press 2)");
            }
        }
    }

    public static void showAvailableBooks(String fileName) {
        System.out.println("\n-----------------Available books-----------------");
        System.out.printf("%-5s %-45s %-20s%n", "ID", "Title", "ISBN");
        System.out.println("-".repeat(70));

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            br.readLine(); // skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                int id       = Integer.parseInt(values[0].trim());
                String title = values[1].trim();
                String isbn  = values[2].trim();

                System.out.printf("%-5d %-45s %-20s%n", id, title, isbn);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkoutBooks() {

    }

}