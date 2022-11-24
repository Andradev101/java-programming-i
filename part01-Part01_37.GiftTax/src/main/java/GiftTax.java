
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        Integer giftPrice = Integer.valueOf(scan.nextLine());
        Integer fixedTax;

        if (giftPrice <= 5000) {
            System.out.println("No tax!");
        } else if (giftPrice > 5000 && giftPrice < 25000) {
            fixedTax = 100;
            System.out.println(calculateTax(giftPrice, fixedTax, 5000, 8));
        } else if (giftPrice >= 25000 && giftPrice < 55000) {
            fixedTax = 1700;
            System.out.println(calculateTax(giftPrice, fixedTax, 25000, 10));
        } else if (giftPrice >= 55000 && giftPrice < 200000) {
            fixedTax = 4700;
            System.out.println(calculateTax(giftPrice, fixedTax, 55000, 12));
        } else if (giftPrice >= 200000 && giftPrice < 1000000) {
            fixedTax = 22100;
            System.out.println(calculateTax(giftPrice, fixedTax, 200000, 15));
        } else if (giftPrice > 1000000) {
            fixedTax = 142100;
            System.out.println(calculateTax(giftPrice, fixedTax, 1000000 , 17));
        }
    }

    private static String calculateTax(Integer giftPrice, Integer fixedTax, Integer lowerLimitPrice, Integer percentage) {
        Double percentageComputation = Double.valueOf(percentage);
        Double giftTaxPrice = Double.valueOf(fixedTax + (giftPrice - lowerLimitPrice) * (Double.valueOf(percentageComputation/100)));
        return "Tax: " + giftTaxPrice;
    }
}
