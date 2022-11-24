
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManagement grades = new GradeManagement();
        final Integer STOP_COMMAND = -1;

        System.out.println("Enter point totals, " + STOP_COMMAND + " stops:");
        while(true) {
            
            Integer gradeInput = Integer.valueOf(scanner.nextLine());
            if(gradeInput == STOP_COMMAND) {
                break;
            }
            grades.addPoint(gradeInput);
        }

        grades.print();
        //way better implementation
            //this was updated after seeing the model.
            //no logic updated.
    }
}
