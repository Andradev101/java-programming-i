
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        Integer greatest = 0;
        Integer i = 0;
        while (i < list.size()) {
            if(list.get(i) > greatest) {
                greatest = list.get(i);
            } 
            i++;
        }

        System.out.println("The greatest number: " + greatest);
    }
}
