public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "The card has a balance of "+ this.balance +" euros";
    }

    public void eatAffordably() {
        Double affordablyFood = 2.60;
        if(this.balance >= affordablyFood) {
            this.balance -= affordablyFood;
        }
    }

    public void eatHeartily() {
        Double heartilyFood = 4.60;
        if(this.balance >= heartilyFood) {
            this.balance -= heartilyFood;
        }
    }

    public void addMoney(double amount) {
        if(amount > 0) {
            this.balance += amount;
        }
        if(this.balance > 150) {
            this.balance = 150;
        }
    }
}
