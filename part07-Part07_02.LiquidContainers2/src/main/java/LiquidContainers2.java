
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        System.out.println("First: "+ first.toString());
        System.out.println("Second: "+ second.toString());


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

            if(command.equalsIgnoreCase("")) {
                continue;
            }
            if(!command.equalsIgnoreCase("add") && !command.equalsIgnoreCase("move") && !command.equals("remove")) {
                continue;
            }

            if(command.equalsIgnoreCase("add")) {
                first.add(amount);
            }

            if(command.equals("move")) {
                //amount greater than container content
                //amount equals the content
                //then, transaction
                if(amount > first.contains()) {
                    amount = first.contains();
                    first.remove(amount);
                    second.add(amount);
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            }

            if(command.equalsIgnoreCase("remove")) {
                second.remove(amount);
            }
            System.out.println("First: "+ first.toString());
            System.out.println("Second: "+ second.toString());
        }
    }
}