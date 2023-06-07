package codingPractice;

import java.util.HashSet;

public class RemoveDuplicateExample {

    public static void main(String args[]) {
        int arrayNumber[] = {1, 3, 2, 3, 3, 4, 5, 5};
        HashSet<Integer> uinqueSet = new HashSet<>();
        for (int index = 0; index < arrayNumber.length; index++) {
            uinqueSet.add(arrayNumber[index]);
        }
        for (int count : uinqueSet) {
            System.out.print(count + " ");
        }
    }
}