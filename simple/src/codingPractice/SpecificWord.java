package codingPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SpecificWord {

    public static void main(String[] args) {
        //create color list
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");
        System.out.println("The colour list is : "+colors.toString());

        // Specify the word to search for
        String searchColor = "Orange";

        // Check if the list contains the specified color using a lambda expression
        Predicate<String> containWord = word -> word.equals(searchColor);
        boolean flag = colors.stream().anyMatch(containWord);
        System.out.println("Is the color " + searchColor + " present in the list? " + flag);

        // Specify the word to search for
        String searchColorTwo = "White";
        Predicate<String> containWordOne = word -> word.equals(searchColorTwo);
        boolean flagOne = colors.stream().anyMatch(containWordOne);
        // Print the result
        System.out.println("\nIs the word " + searchColorTwo + " present in the list? " + flagOne);
    }
}
