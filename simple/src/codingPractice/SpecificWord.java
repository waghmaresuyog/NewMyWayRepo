package codingPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SpecificWord {

    public static void main(String[] args) {
        //create color list
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");
        System.out.println("The colour list is : " + colors.toString());

        // Specify the word to search for
        String searchColor = "Orange";
        // Check if the list contains the specified color using a lambda expression
        System.out.println("Is the color " + searchColor + " present in the list? "
                + searchColorOne(colors, searchColor));

        // Specify the word to search for
        String searchColorTwo = "White";
        // Print the result
        System.out.println("\nIs the word " + searchColorTwo + " present in the list? "
                + searchColorOne(colors, searchColorTwo));
    }

    public static boolean searchColorOne(List<String> colors, String searchColorTwo) {
        Predicate<String> containWordOne = word -> word.equals(searchColorTwo);
        boolean flagOne = colors.stream().anyMatch(containWordOne);
        return flagOne;
    }
}