
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program

        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person leoEqual = new Person("Leo", date, 62, 9);
        Person leoBirthdayDiff = new Person("Leo", date2, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        } else {
            System.out.println("Different");
        }

        if (leo.equals(leoEqual)) {
            System.out.println("Correct");
        } else {
            System.out.println("Different");
        }

        if (leo.equals(leoBirthdayDiff)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
