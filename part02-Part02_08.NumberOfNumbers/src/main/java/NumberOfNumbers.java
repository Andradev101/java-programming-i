
import java.util.Scanner;

public class NumberOfNumbers {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer count = 0;
		while (true) {
			System.out.println("Give a number:");
			Integer num = Integer.valueOf(scanner.nextLine());

			if (num == 0) {
				break;
			}
			count++;
		}
		System.out.println("Number of numbers: " + count);
	}
}
