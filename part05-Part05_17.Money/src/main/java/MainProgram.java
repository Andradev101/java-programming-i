
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
    Money firstMoneyObject = new Money(1, 50);
    Money secondMoneyObject = new Money(2, 0);
    //Money firstMinusSecond = firstMoneyObject.plus(secondMoneyObject);
    Money after = firstMoneyObject.minus(secondMoneyObject);
    //System.out.println(after);
    }
}
