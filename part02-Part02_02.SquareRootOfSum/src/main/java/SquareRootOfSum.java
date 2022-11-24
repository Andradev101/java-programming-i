
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer firstNum = Integer.valueOf(scanner.nextLine());
        Integer secondNum = Integer.valueOf(scanner.nextLine());

        //if( firstNum < 0 ) {firstNum = 0;}
        //if(secondNum < 0 ) {secondNum = 0;}

        System.out.println(Math.sqrt(firstNum + secondNum));

    }
}
