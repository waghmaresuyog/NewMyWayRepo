package codingPractice;

import java.util.HashSet;

public class RemoveDuplicateExample {

    public static void removeDuplicates(int[] arrayNumber) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int index = 0; index < arrayNumber.length; index++) {
            uniqueSet.add(arrayNumber[index]);
        }
        for (int count : uniqueSet) {
            System.out.print(count + " ");
        }
    }

    public static void main(String args[]) {
        int arrayNumber[] = {1, 3, 2, 3, 3, 4, 5, 5};
        removeDuplicates(arrayNumber);
    }
}