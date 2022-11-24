
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        Integer num = Integer.valueOf(scanner.nextLine());
        Integer sum = 0;

        for(Integer i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
