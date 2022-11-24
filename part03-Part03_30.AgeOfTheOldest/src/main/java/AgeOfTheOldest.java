
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> peopleList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();


        while(true){
            String person = scanner.nextLine();
            if(person.equals("")) {
                break;
            }
            String[] personData = person.split(",");
            
            peopleList.add(personData[0]);
            ageList.add(Integer.valueOf(personData[1]));
        }

        Integer oldest = 0;
        for(Integer age : ageList) {
            if(age > oldest) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
