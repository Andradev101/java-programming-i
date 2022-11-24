
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer count = 0;
        Integer sum = 0;
		while (true) {
			System.out.println("Give a number:");
			Integer num = Integer.valueOf(scanner.nextLine());

			if (num == 0) {
				break;
			}
			count++;
            sum += num;
		}
		System.out.println("Number of numbers: " + count);
		System.out.println("Sum of the numbers: " + sum);
    }
}
