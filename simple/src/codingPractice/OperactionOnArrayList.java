package codingPractice;

import java.util.ArrayList;
import java.util.Collections;

public class OperactionOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Adding elements to the ArrayList
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(1);
        // Displaying the original list
        System.out.println("Original ArrayList: " + numbers);

        // Sorting the list in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList (Ascending Order): " + numbers);

        // Reversing the order of elements
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList: " + numbers);

        // Finding the maximum value
        int max = Collections.max(numbers);
        System.out.println("Maximum value in the ArrayList: " + max);

        // Finding the minimum value
        int min = Collections.min(numbers);
        System.out.println("Minimum value in the ArrayList: " + min);

        // Removing the element at index 2
        numbers.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + numbers);

        // Checking if the list contains a specific value
        boolean contains = numbers.contains(5);
        System.out.println("ArrayList contains 5: " + contains);

        // Clearing the entire list
        numbers.clear();
        System.out.println("ArrayList after clearing all elements: " + numbers);
    }

}
