
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(Integer i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(Integer i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(Integer i = 0; i < size; i++) {
            printSpaces(size - (i + 1));
            printStars(i + 1);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for(Integer i = 0; i < height; i++) {
            printSpaces(height - (i + 1));
            if(i > 0) {
                printStars((i * 2) + 1);
            }else{
                printStars(i + 1);
            }
        }
        Integer treeHeight = 2;
        for(Integer j = 0; j < treeHeight; j++){
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(3);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
