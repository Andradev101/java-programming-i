
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer firstNum = Integer.valueOf(scanner.nextLine());
        Integer secondNum = Integer.valueOf(scanner.nextLine());

        if(firstNum > secondNum) {
            System.out.println(firstNum + " is greater than " + secondNum);
        } else if(secondNum > firstNum) {
            System.out.println(secondNum + " is smaller than " +  firstNum);
        } else {
            System.out.println(firstNum + " is equal to " + secondNum);
        }
    }
}
