
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                String[] data = reader.nextLine().split(",");
                String name = data[0];
                Integer age = Integer.valueOf(data[1]);

                System.out.println(name + ", " + age + " " +(age == 0 || age > 1 ? "years" : "year"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
