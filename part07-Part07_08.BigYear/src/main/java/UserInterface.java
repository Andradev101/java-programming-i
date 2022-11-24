import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private BirdDatabase birdDatabase;
    
    public UserInterface(Scanner scanner, BirdDatabase birdDatabase) {
        this.scanner = scanner;
        this.birdDatabase = birdDatabase;
    }

    public void start() {

        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");

        while(true) {
            System.out.println("?");
            String command = this.scanner.nextLine();
    
            if(command.equalsIgnoreCase("quit")){
                break;
            }
    
            manageNavigation(command);
        }
    }

    private void manageNavigation(String command) {
        if(command.equalsIgnoreCase("add")){
            // add a bird to the db
            System.out.println("Name: ");
            String birdName = this.scanner.nextLine();
            
            System.out.println("Name in Latin: ");
            String birdNameLatin = this.scanner.nextLine();

            Bird bird = new Bird(birdName, birdNameLatin);
            this.birdDatabase.addBird(bird);
        }
        if(command.equalsIgnoreCase("observation")){
            // adds an obs
            System.out.println("Bird?");
            String searchKey = this.scanner.nextLine();

            Bird foundBird = this.birdDatabase.getBirdByName(searchKey);
            if(foundBird == null) {
                System.out.println("Not a bird!");
                return;
            }
            foundBird.addObservation();
        }
        if(command.equalsIgnoreCase("all")){
            System.out.println(this.birdDatabase.listBirds());
        }
        if(command.equalsIgnoreCase("one")){
            // print a bird
            System.out.println("Bird?");
            String searchKey = this.scanner.nextLine();
            
            Bird foundBird = this.birdDatabase.getBirdByName(searchKey);
            if(foundBird == null) {
                return;
            }
            System.out.println(foundBird.toString());
        }
        return;
    }
}
