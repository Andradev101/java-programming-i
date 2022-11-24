import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title:");
            String bookTitle = scanner.nextLine();
            if(bookTitle.equals("")) {
                break;
            }

            System.out.println("Pages:");
            int bookPages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Pages:");
            int bookPublicationYear = Integer.valueOf(scanner.nextLine());

            Book newBook = new Book(bookTitle, bookPages, bookPublicationYear);
            bookList.add(newBook);
        }

        System.out.println("What information will be printed?");
        String printOptionInput = scanner.nextLine();
        if(printOptionInput.equals("everything")) {
            printEverything(bookList);
        } else if(printOptionInput.equals("name")) {
            printNames(bookList);
        }

    }

    public static void printEverything(ArrayList<Book> bookList){
        for(Book singleBook : bookList) {
            System.out.println(singleBook.getTitle() + ", " + singleBook.getPages() + " pages, " + singleBook.getPublicationYear());
        }
    }

    public static void printNames(ArrayList<Book> bookList){
        for(Book singleBook : bookList) {
            System.out.println(singleBook.getTitle());
        }
    }
}
