import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private RecipeManagement recipeManagement;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipeManagement = new RecipeManagement();
    }

    public void start() {
        System.out.println("File do read: ");
        String filename = scanner.nextLine();

        String output= "";
        try(Scanner reader = new Scanner(Paths.get(filename))) {
            while(reader.hasNextLine()) {
                output += reader.nextLine();
                output += ":"; 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //done reading file
        this.recipeManagement.treatData(output);

        //menu opens
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while(true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            
            if(command.equalsIgnoreCase("stop")){
                break;
            }

            manageNavigation(command);
        }
    }

    private void manageNavigation(String command) {
        if(command.equalsIgnoreCase("list")) {
            System.out.println(this.recipeManagement.listRecipes());
            return;
        }
        
        //i don't know if this is the best way
        String[] commandDetail = command.split("find ");
        if(!command.contains("find ")) {
            return;
        }
        String detail = commandDetail[1];
        
        if(detail.equalsIgnoreCase("name")) {
            //calls name search method
            System.out.println("Searched word: ");
            String searchKey = scanner.nextLine();

            System.out.println(this.recipeManagement.getRecipesByName(searchKey));
        }
        if(detail.equalsIgnoreCase("cooking time")) {
            System.out.println("Searched word: ");
            Integer searchKey = Integer.valueOf(scanner.nextLine());

            System.out.println(this.recipeManagement.getRecipesByCookingTime(searchKey));
        }
        if(detail.equalsIgnoreCase("ingredient")) {
            System.out.println("Ingredient:");
            String ingredientInput = scanner.nextLine();

            System.out.println(this.recipeManagement.getRecipesByIngredient(ingredientInput));
        }
        return;
    }
}
