
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        Boolean found = false;
        String name = scanner.nextLine();
        for(Integer i = 0; i < list.size(); i++) {
            if(list.get(i).equals(name)) {
                found = true;
            }
        }
        
        if(found) {
            System.out.println(name + " was found!");
        } else {
            System.out.println(name + " was not found!");
        }
    }
}
