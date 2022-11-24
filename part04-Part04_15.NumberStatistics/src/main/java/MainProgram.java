
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        System.out.println("Enter numbers:");
        while(true) {
            Integer numInput = 0;
            try {
                numInput = Integer.valueOf(scanner.nextLine());
            }
            catch (NumberFormatException exc) {
                numInput = 0;
            }
            if(numInput < 0) {
                break;
            }

            statistics.addNumber(numInput);
            if(numInput % 2 == 0) {
                statisticsEven.addNumber(numInput);
            } else {
                statisticsOdd.addNumber(numInput);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}
