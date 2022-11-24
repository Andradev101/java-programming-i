
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer count = 0;
        Integer sum = 0;
		while (true) {
			System.out.println("Give a number:");
			Integer num = Integer.valueOf(scanner.nextLine());

			if (num == 0) {
				break;
			} else if(num > 0) {
                count++;
                sum += num;
            }
		}

        if(count == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }
        System.out.println("Average of the numbers: " + Double.valueOf(sum.doubleValue()/count.doubleValue()));
    }
}
