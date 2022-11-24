
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer negativeCount = 0;
		while (true) {
			System.out.println("Give a number:");
			Integer num = Integer.valueOf(scanner.nextLine());

			if (num == 0) {
				break;
			} else if(num < 0){
                negativeCount++;
            }
		}
		System.out.println("Number of negative numbers: " + negativeCount);
    }
}
