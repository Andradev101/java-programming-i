
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            
            Boolean duplicatedBook = checkBookExists(books, name, publicationYear);
            if(!duplicatedBook) {
                books.add(book);
            } else {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            }
        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }

    private static boolean checkBookExists(ArrayList<Book> lBooks, String name, int publicationYear) {
        Boolean found = false;
        for(Book singleBook : lBooks) {
            if(name.equals(singleBook.getName()) && publicationYear == singleBook.getPublicationYear()) {
                found = true;
                break;
            }
        }
        return found;
    }
}
