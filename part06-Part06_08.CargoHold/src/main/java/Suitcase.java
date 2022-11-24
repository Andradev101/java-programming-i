import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> itemList;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.itemList = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if(item.getWeight() > maximumWeight) {
            return;
        }
        
        int totalSuitcaseWeight = totalWeight();
        if(item.getWeight() > (maximumWeight - totalSuitcaseWeight)) {
            return;
        }

        this.itemList.add(item);
    }

    public int totalWeight() {

        int totalWeight = 0;
        for(Item item : this.itemList) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        
        if(this.itemList.size() <= 0) {
            return null;
        }

        Item toReturn = new Item("nameless", Integer.MIN_VALUE);
        for(Item item : this.itemList) {
            if(item.getWeight() > toReturn.getWeight()) {
                toReturn = item;
            }
        }
        return toReturn;
    }

    public void printItems() {
        String output = "";

        for(Integer i = 0; i < this.itemList.size(); i++) {

            Item currentItemInLoop = this.itemList.get(i);
            output += currentItemInLoop.getName() + " (" + currentItemInLoop.getWeight() + " kg)";
            if(!(i == this.itemList.size() - 1) && this.itemList.size() > 1) {
                output += "\n";
            }
        }
        System.out.println(output);
    }

    @Override
    public String toString() {
        if(this.itemList.size() == 0) {
            return "no items (" + totalWeight() + "kg)";
        }
        String itemPluralStatus = this.itemList.size() == 1 ? "item" : "items";
        return this.itemList.size() + " " + itemPluralStatus + " (" + totalWeight() + "kg)";
    }
}
// B) pun intended