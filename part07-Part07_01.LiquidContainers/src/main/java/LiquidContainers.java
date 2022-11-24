
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer first = 0;
        Integer second = 0;

        System.out.println("First: "+ first +"/100");
        System.out.println("Second: "+ second +"/100");

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            String command = "";
            Integer amount = 0;
            if(input.contains(" ")) {

                String[] commandAndAmount = input.split(" ");
                command = commandAndAmount[0];
                amount = Integer.valueOf(commandAndAmount[1]);
            }

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            //functionalities
                //verify command
            if(command.equalsIgnoreCase("")) {
                continue;
            }
            if(!command.equalsIgnoreCase("add") && !command.equalsIgnoreCase("move") && !command.equals("remove")) {
                continue;
            }

            //command add
                //first container
            if(command.equalsIgnoreCase("add")) {
                if(amount <= 0) {
                    amount = 0;
                }
                first += amount;
                if(first >= 100) {
                    first = 100;
                }
            }

            //command move
            if(command.equals("move")) {
                if(amount <= 0) {
                    amount = 0;
                }

                //verify if amount is greater than the liquid held, move all remaining liquid
                if(amount > first){
                    amount = first;
                }
                second += amount;
                first -= amount;
                
                //set first container to 0 if it become negative in the transaction
                if(first < 0) {
                    first = 0;
                }
                //if second has more liquid than it can hold, all the remider goes to waste
                if(second >= 100) {
                    second = 100;
                }
            }

            if(command.equalsIgnoreCase("remove")) {
                //if amount greater than second container liquid held, remove all the liquid
                if(amount > second) {
                    amount = second;
                } else {
                    second -= amount;
                }
            }
            System.out.println("First: "+ first +"/100");
            System.out.println("Second: "+ second +"/100");
        }
    }
}
