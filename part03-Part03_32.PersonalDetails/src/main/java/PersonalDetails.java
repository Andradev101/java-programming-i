
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> birthYearList = new ArrayList<>();
        while(true){
            String person = scanner.nextLine();
            if(person.equals("")) {
                break;
            }
            String[] personData = person.split(",");
            
            nameList.add(personData[0]);
            birthYearList.add(Integer.valueOf(personData[1]));
        }

        String longestName = "";
        Integer birthYearsSum = 0;
        for(Integer i = 0; i < nameList.size(); i++) {
            Integer nameLength = nameList.get(i).length();
            if(nameLength > longestName.length()) {
                longestName = nameList.get(i);
            }
            birthYearsSum += birthYearList.get(i);
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + birthYearsSum.doubleValue()/birthYearList.size());
    }
}
