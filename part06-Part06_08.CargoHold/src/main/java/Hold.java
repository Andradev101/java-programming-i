import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcaseList;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.suitcaseList = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if(suitcase.totalWeight() > maximumWeight) {
            return;
        }
        
        int totalHoldWeight = totalWeight();
        if(suitcase.totalWeight() > (maximumWeight - totalHoldWeight)) {
            return;
        }

        this.suitcaseList.add(suitcase);
    }

    public int totalWeight() {

        int totalWeight = 0;
        for(Suitcase suitcase : this.suitcaseList) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        String output = "";

        for(Integer i = 0; i < this.suitcaseList.size(); i++) {

            Suitcase currentSuitcaseInLoop = this.suitcaseList.get(i);
            currentSuitcaseInLoop.printItems();
        }
        System.out.println(output);
    }
    
    @Override
    public String toString() {
        return this.suitcaseList.size() + " suitcases (" + totalWeight() + "kg)"; 
    }
}
