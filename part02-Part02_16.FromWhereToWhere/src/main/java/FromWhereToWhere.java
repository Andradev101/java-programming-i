
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        Integer finalNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        Integer startNum = Integer.valueOf(scanner.nextLine());

        for(Integer i = startNum; i <= finalNum; i++) {
            System.out.println(i);
        }
    }
}
