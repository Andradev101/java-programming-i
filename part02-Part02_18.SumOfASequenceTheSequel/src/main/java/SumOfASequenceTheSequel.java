
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        Integer startNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        Integer finalNum = Integer.valueOf(scanner.nextLine());
        Integer sum = 0;

        for(Integer i = startNum; i <= finalNum; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
