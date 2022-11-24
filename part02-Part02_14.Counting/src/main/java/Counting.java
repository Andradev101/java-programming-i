
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer num = Integer.valueOf(scanner.nextLine());

        for(Integer i = 0; i <= num; i++){
            System.out.println(i);
        }
    }
}
