
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();

        Integer i = 0;
        while (i < 361671) {
            System.out.println(timer);
            timer.advance();
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {
        
            }
            i++;
        }
    }
}
