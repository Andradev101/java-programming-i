
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        	System.out.println("Give a string:");
            String strInput = scan.nextLine();
        	System.out.println("Give an integer:");
            Integer intInput = Integer.valueOf(scan.nextLine());
        	System.out.println("Give a double:");
            Double doubleInput = Double.valueOf(scan.nextLine());
        	System.out.println("Give a boolean:");
            Boolean boolInput = Boolean.valueOf(scan.nextLine());
            
        	System.out.println("You gave the string " + strInput);
        	System.out.println("You gave the integer " + intInput);
        	System.out.println("You gave the double " + doubleInput);
        	System.out.println("You gave the boolean " + boolInput);
    }
}
