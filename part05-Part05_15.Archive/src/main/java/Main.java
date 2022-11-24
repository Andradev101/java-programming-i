
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> itemList = new ArrayList<>();

        while(true) {
            
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }

            Item item = new Item(identifier, name);

            Boolean duplicatedItem = checkItemExists(itemList, identifier);
            if(!duplicatedItem) {
                itemList.add(item);
            }
        }
        System.out.println("==Items==");
        for(Item singleItem : itemList) {
            System.out.println(singleItem.getIdentifier() + ": " + singleItem.getName());
        }
    }

    private static boolean checkItemExists(ArrayList<Item> lItems, String identifier) {
        Boolean found = false;
        if(!lItems.isEmpty()){
            for(Item singleItem : lItems) {
                if(identifier.equals(singleItem.getIdentifier())) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }
}
