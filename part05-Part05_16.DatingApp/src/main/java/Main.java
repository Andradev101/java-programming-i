
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(30, 12, 2000);
        //testing how should day count days into months and years!
        // int input = 45;
        // System.out.println("Years passed - (days input | max): " + input/360); //okay
        // System.out.println("Years passed - modulo days: " + (input > 360 ? input%360 : 360%input)); //okay
        // System.out.println();
        // System.out.println("Months passed - (days input | max): " + input/30); //okay
        // System.out.println("Months passed - modulo days: " + (input > 30 ? input%30 : 30%input)); //okay
        System.out.println("Initial");
        System.out.println(date);
        // date.advance();
        // date.advance(29);
        // date.advance();
        // date.advance(360);
        // date.advance(180);
        // System.out.println(date);
        // date.advance();
        // System.out.println(date);
        // date.advance(30);
        // System.out.println(date);

        // date.advance(45);
        // System.out.println(date);
        // System.out.println(date.afterNumberOfDays(720));
    }
}
