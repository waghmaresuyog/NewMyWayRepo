package codingPractice;

import java.util.*;

public class MergeTwoList {

    public static <T> List<T> mergeLists(List<T> listOne, List<T> listTwo) {
        List<T> mergedList = new ArrayList<>();
        int maxLength = Math.max(listOne.size(), listTwo.size());
        for (int index = 0; index < maxLength; index++) {
            if (index < listOne.size()) {
                mergedList.add(listOne.get(index));
            }
            if (index < listTwo.size()) {
                mergedList.add(listTwo.get(index));
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> numberListOne = List.of(1, 3, 6, 7);
        List<Integer> numberListTwo = List.of(9, 4, 2, 8);
        System.out.println("List of Numbers:");
        System.out.println(numberListOne);
        System.out.println(numberListTwo);

        List<Integer> mergedNumbers = mergeLists(numberListOne, numberListTwo);
        System.out.println("Unsorted Number list is : "+mergedNumbers);
        Collections.sort(mergedNumbers); // Sort the merged list

        System.out.println("Merged and Sorted Numbers:");
        System.out.println(mergedNumbers);

        List<String> colorOne = List.of("Red", "Green", "Blue");
        List<String> colorTwo = List.of("White", "Black", "Orange", "Pink");
        System.out.println("List of Colors:");
        System.out.println(colorOne);
        System.out.println(colorTwo);

        List<String> mergedColors = mergeLists(colorOne, colorTwo);
        Collections.sort(mergedColors); // Sort the merged list

        System.out.println("Merged and Sorted Colors:");
        System.out.println(mergedColors);


    }
}
