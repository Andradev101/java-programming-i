import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftList = new ArrayList<>();

    public Package() {

    }

    public void addGift(Gift gift) {
        if(!gift.getName().isEmpty() && gift.getWeight() > 0) {
            this.giftList.add(gift);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for(Gift singleGift : giftList) {
            totalWeight += singleGift.getWeight();
        }

        return totalWeight;
    }
}
