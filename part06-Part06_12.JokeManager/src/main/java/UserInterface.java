import java.util.Scanner;

public class UserInterface {
    
    private JokeManager jokeManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            
            if(command.toUpperCase().equals("X")) {
                return;
            }

            manageCommands(command);
        }
    }

    private void manageCommands(String command){
        if(command.equals("1")) {
            commandAdd();
        }

        if(command.equals("2")) {
            commandDrawJoke();
        }

        if(command.equals("3")) {
            commandListJokes();
        }

        return;
    }

    public void commandAdd(){
        System.out.println("Write the joke to be added: ");
        String joke = scanner.nextLine();
        jokeManager.addJoke(joke);
    }

    public void commandDrawJoke(){
        System.out.println(jokeManager.drawJoke());
    }

    public void commandListJokes(){
        System.out.println("Printing the jokes.");
        jokeManager.printJokes();
    }
}
