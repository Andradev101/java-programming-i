
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

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

        Integer oldestIndex = 0;
        Integer oldest = 0;
        for(Integer i = 0; i < ageList.size(); i++) {
            
            if(ageList.get(i) > oldest){
                oldest = ageList.get(i);
                oldestIndex = i;
            }
        }

        System.out.println("Age of the oldest: " + peopleList.get(oldestIndex));
    }
}
