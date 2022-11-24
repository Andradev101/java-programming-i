
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer firstInput = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer secondInput = Integer.valueOf(scanner.nextLine());

        System.out.println(firstInput + " + " + secondInput + " = " + (firstInput + secondInput));
        System.out.println(firstInput + " - " + secondInput + " = " + (firstInput - secondInput));
        System.out.println(firstInput + " * " + secondInput + " = " + (firstInput * secondInput));
        System.out.println(firstInput + " / " + secondInput + " = " + (firstInput.doubleValue() / secondInput.doubleValue()));

    }
}
