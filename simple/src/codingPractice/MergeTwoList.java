package codingPractice;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {

    public static List mergeLists(List numberListOne, List numberListTwo) {
        List mergeList = new ArrayList<>();
        int maxLength = Math.max(numberListOne.size(), numberListTwo.size());
        for (int index = 0; index < maxLength; index++) {
            if (index < numberListOne.size()) {
                mergeList.add(numberListOne.get(index));
            }
            if (index < numberListTwo.size()) {
                mergeList.add(numberListTwo.get(index));
            }
        }

        return mergeList;
    }


    public static void main(String[] args) {
        List<Integer> numberListOne = List.of(1, 3, 6, 7);
        List<Integer> numberListTwo = List.of(2, 4, 8, 9);
        System.out.println("List of Number is : ");
        System.out.println(numberListOne);
        System.out.println(numberListTwo);
        List mergedNumbers = MergeTwoList.mergeLists(numberListOne, numberListTwo);
        System.out.println("The Merge Number is : " + mergedNumbers);
        List<String> colorOne = List.of("Red", "Green", "Blue");
        List<String> colorTwo = List.of("White", "Black", "Orange", "Pink");
        System.out.println("List of color is ");
        System.out.println(colorOne);
        System.out.println(colorTwo);
        System.out.println("Merged Colors is : ");
        List mergeCorlor = MergeTwoList.mergeLists(colorOne, colorTwo);
        System.out.println(mergeCorlor);


    }
}
