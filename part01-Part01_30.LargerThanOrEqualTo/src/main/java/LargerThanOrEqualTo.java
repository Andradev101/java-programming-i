
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        Integer firstNum = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        Integer secondNum = Integer.valueOf(scan.nextLine());

        if(firstNum == secondNum) {
            System.out.println("The numbers are equal!");
        } else if (firstNum > secondNum) {
            System.out.println("Greater number is: " + firstNum);
        }else if (secondNum > firstNum) {
            System.out.println("Greater number is: " + secondNum);
        }
    }
}
