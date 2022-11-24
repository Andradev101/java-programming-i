
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(true) {
            Integer num = Integer.valueOf(scanner.nextLine());
            if(num == 9999) {
                break;
            }
            list.add(num);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        Integer smallest = Integer.MAX_VALUE;
        for(Integer i = 0; i < list.size(); i++) {
            if(list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for(Integer i = 0; i < list.size(); i++) {
            if(list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
