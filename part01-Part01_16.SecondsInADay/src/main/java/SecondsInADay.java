
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        Integer daysInput = Integer.valueOf(scanner.nextLine());

        Integer daysToHours = daysInput * 24;
        Integer hoursToMinutes = daysToHours * 60;
        Integer minutesToSeconds = hoursToMinutes * 60;

        System.out.println(minutesToSeconds);
    }
}
