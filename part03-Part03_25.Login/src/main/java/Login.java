
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] user0 = {"alex","sunshine"};
        String[] user1 = {"emma","haskell"};

        System.out.println("Enter username:");
        String userInput = scanner.nextLine();
        
        System.out.println("Enter password:");
        String passInput = scanner.nextLine();

        if( (userInput.equals(user0[0]) && passInput.equals(user0[1])) || 
            (userInput.equals(user1[0]) && passInput.equals(user1[1]))  ) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
