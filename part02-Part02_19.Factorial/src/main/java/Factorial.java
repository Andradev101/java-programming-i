
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        Integer num = Integer.valueOf(scanner.nextLine());
        Integer factorial = 1;

        for(Integer i = 1; i <= num; i++) {
            factorial *= i;
        }  

        System.out.println("Factorial: " + factorial);
    }
}
