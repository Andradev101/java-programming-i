
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        Money increasedMoney = new Money(euros, cents);
        increasedMoney = increasedMoney.handleTransaction(addition, "plus");
        return increasedMoney;
    }

    public Money minus(Money decreaser) {
        Money decreasedMoney = new Money(euros, cents);
        decreasedMoney = decreasedMoney.handleTransaction(decreaser, "minus");
        return decreasedMoney;
    }

    public boolean lessThan(Money compared) {
        boolean itIsLess = true;
        Money operationResult = this.minus(compared);
        if(operationResult.cents != 0 || operationResult.euros != 0){
            itIsLess = false;
        }
        return itIsLess;
    }

    //transactionHub class
    private Money handleTransaction(Money transactionMoneyObject, String operation){
        final String OPERATION_PLUS = "plus";
        final String OPERATION_MINUS = "minus";

        int newEuroValue = 0;
        int newCentsValue = 0;
        if(operation.toLowerCase().equals(OPERATION_PLUS)) {
            newEuroValue = handleEuroAddition(transactionMoneyObject.euros);
            newCentsValue = handleCentAddition(transactionMoneyObject.cents);
        }
        
        if(operation.toLowerCase().equals(OPERATION_MINUS)) {
            Money handledMinusMoneyObj = this.handleMinusOperation(transactionMoneyObject);
            newEuroValue = handledMinusMoneyObj.euros;
            newCentsValue = handledMinusMoneyObj.cents;
        }
        
        Money handledMoney = new Money(newEuroValue, newCentsValue);
        System.out.println("lets go " + handledMoney);
        return handledMoney;
    }

    private int handleEuroAddition(int incomingEuro) {
        int outcomingEuro = euros();

        if(incomingEuro < 0) {
            incomingEuro = 0;
        }
        outcomingEuro += incomingEuro; 

        return outcomingEuro;
    }

    private int handleCentAddition(int incomingCent) {
        int outcomingCents = cents();
        if(incomingCent < 0) {
            incomingCent = 0;
        }
        
        if(incomingCent > 99) {
            outcomingCents += incomingCent / 100;
            incomingCent = incomingCent % 100;
        }

        return outcomingCents += incomingCent;
    }

    private Money handleMinusOperation(Money transactionMoneyObject){
        int manipulateIncomingEuros = transactionMoneyObject.euros;
        int manipulateIncomingCents = transactionMoneyObject.cents;

        int manipulateInstanceEuros = this.euros();
        int manipulateInstanceCents = this.cents();
         
        //first check
        manipulateIncomingEuros = checkMoneyNegative(manipulateIncomingEuros);
        manipulateIncomingCents = checkMoneyNegative(manipulateIncomingCents);

        //cents calc
        int newCentsValue = handleCentSubtractionValue(manipulateInstanceCents, manipulateIncomingCents);
        boolean euroCycled = euroCycled(manipulateInstanceCents, manipulateIncomingCents);
        if(euroCycled) {
            manipulateIncomingEuros++;
        }

        int newEurosValue = manipulateInstanceEuros - manipulateIncomingEuros;
        if(newEurosValue < 0) { //means the Money value is negative, then it shall be zero
            newEurosValue = 0;
            newCentsValue = 0;
        }

        Money handledMinus = new Money(newEurosValue, newCentsValue);
        return handledMinus;
    }

    private int checkMoneyNegative(int value){
        if(value < 0) {
            value = 0;
        }
        return value;
    }

    private int handleCentSubtractionValue(int originalValue, int toSubtract) {
        int newCentsValue = 0;
        if((originalValue - toSubtract) >= 0) {
            newCentsValue = originalValue - toSubtract;
        } else { //euro should cycle by 1
            newCentsValue = (originalValue - toSubtract) + 100;
        }
        return newCentsValue;
    }

    private boolean euroCycled(int originalValue, int toSubtract) {
        boolean euroCycled = false;
        int newCentsValue = 0;
        if((originalValue - toSubtract) >= 0) {
            newCentsValue = originalValue - toSubtract;
        } else { //euro should cycle by 1
            newCentsValue = (originalValue - toSubtract) + 100;
            euroCycled = true;
        }
        return euroCycled;
    }
}
