
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer num = Integer.valueOf(scanner.nextLine());

        for(Integer i = num; i <= 100; i++){
            System.out.println(i);
        }
    }
}
