
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    
    //price constants
    private static final double AFFORDABLE_MEAL_PRICE = 2.50;
    private static final double HEARTILY_MEAL_PRICE = 4.30;
    //identification constants
    private static final String AFFORDABLE_MEAL_NAME = "affordable";
    private static final String HEARTILY_MEAL_NAME = "heartily";

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        String itemSoldName = this.AFFORDABLE_MEAL_NAME;

        if(payment >= this.AFFORDABLE_MEAL_PRICE) {
            increaseSoldMealsByName(itemSoldName);
            increaseMoney(this.AFFORDABLE_MEAL_PRICE);
            return payment - this.AFFORDABLE_MEAL_PRICE;
        } else {
            return payment; 
            //i was returning this.AFFORDABLE_MEAL_PRICE.
            //So whenever someone's payment failed, the terminal returned the payment + some money
            //dangerous but funny
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        String itemSoldName = this.AFFORDABLE_MEAL_NAME;

        if(card.balance() >= this.AFFORDABLE_MEAL_PRICE){
            increaseSoldMealsByName(itemSoldName);
            card.takeMoney(this.AFFORDABLE_MEAL_PRICE);
            return true;
        } else {
            return false;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        String itemSoldName = this.HEARTILY_MEAL_NAME;

        if(payment >= this.HEARTILY_MEAL_PRICE) {
            increaseSoldMealsByName(itemSoldName);
            increaseMoney(this.HEARTILY_MEAL_PRICE);
            return payment - this.HEARTILY_MEAL_PRICE;
        } else {
            return payment;
            //i was returning this.HEARTILY_MEAL_PRICE.
            //So whenever someone's payment failed, the terminal returned the payment + some money
            //dangerous but funny
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        String itemSoldName = this.HEARTILY_MEAL_NAME;
        
        if(card.balance() >= this.HEARTILY_MEAL_PRICE){
            increaseSoldMealsByName(itemSoldName);
            card.takeMoney(this.HEARTILY_MEAL_PRICE);
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum > 0) {
            this.money += sum;
            card.addMoney(sum);
        }
    }
    //helpers
    private void increaseMoney(double itemPrice) {
        this.money += itemPrice;
    }

    private void increaseSoldMealsByName(String itemName){
        if(itemName.equals(this.AFFORDABLE_MEAL_NAME)) {
            this.affordableMeals ++;
        } else if(itemName.equals(this.HEARTILY_MEAL_NAME)) {
            this.heartyMeals ++;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
