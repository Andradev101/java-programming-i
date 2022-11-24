
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer sum = 0;
		while (true) {
			System.out.println("Give a number:");
			Integer num = Integer.valueOf(scanner.nextLine());

			if (num == 0) {
				break;
			} else {
				sum += num;
			}
		}

		System.out.println("Sum of the numbers: " + sum);
	}
}
