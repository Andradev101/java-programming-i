
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        Integer sum = 0;
        Integer count = 0;
        Double avg = 0.0;
        Integer even = 0;
        Integer odd = 0;

        while (true) {
            System.out.println("Give numbers:");
            Integer num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }

            sum += num;
            count++;
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        avg = (sum.doubleValue() / count.doubleValue());
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
