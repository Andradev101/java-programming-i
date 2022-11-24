import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        // int[] array = {4, 5, 99, 3, 1, 12};
        // System.out.println("Smallest: " + MainProgram.smallest(array));
        // System.out.println("Smallest Index: " + MainProgram.indexOfSmallest(array));
        
        // int[] numbers = {-1, 6, 9, 8, 12};
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        // int[] numbers = {3, 2, 5, 4, 8};
        // System.out.println(Arrays.toString(numbers));

        // MainProgram.swap(numbers, 1, 0);
        // System.out.println(Arrays.toString(numbers));

        // MainProgram.swap(numbers, 0, 3);
        // System.out.println(Arrays.toString(numbers));

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] intArr){
        int smallest = Integer.MAX_VALUE;
        for(Integer i = 0; i < intArr.length; i++) {
            if(intArr[i] < smallest) {
                smallest = intArr[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] intArr){
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = Integer.MAX_VALUE;
        for(Integer i = 0; i < intArr.length; i++) {
            if(intArr[i] < smallest) {
                smallest = intArr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] intArr, int startIndex){
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = Integer.MAX_VALUE;
        for(Integer i = startIndex; i < intArr.length; i++) {
            if(intArr[i] < smallest) {
                smallest = intArr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] intArr, int from, int to) {

        int auxValue = intArr[from];//a to aux

        intArr[from] = intArr[to];  //b to a
        intArr[to] = auxValue;      //aux to b
    }

    public static void sort(int[] intArr) {

        for (Integer i = 0; i < intArr.length; i++) {
            Integer smallestIndexFromArray = MainProgram.indexOfSmallestFrom(intArr, i);
            MainProgram.swap(intArr, smallestIndexFromArray, i);
            System.out.println(Arrays.toString(intArr));
        }
        //note to self:
            //i == current value of iteration

            //getting the smallest INDEX FROM i [i changes over iterations]
            //SWAP passing: array, the INDEX i got from "smallest INDEX FROM i", i
    }
}
