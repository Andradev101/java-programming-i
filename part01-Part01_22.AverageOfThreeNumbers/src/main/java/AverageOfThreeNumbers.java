
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        Integer third = Integer.valueOf(scanner.nextLine());

        Double avg = Double.valueOf((first.doubleValue() + second.doubleValue() + third.doubleValue())/3);
        System.out.println("The average is "+ avg);
    }
}
