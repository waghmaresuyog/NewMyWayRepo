package codingPractice;

import java.util.Arrays;
import java.util.List;

public class StreamString {

    public static void main(String[] args) {

        List<String> color = Arrays.asList("Red","Green","Blue","Pink","Brown");
        System.out.println("Original List of String of color "+color);
        char startingLetter = 'B';
        long length =color.stream().filter(sort ->sort.startsWith(String.valueOf(startingLetter))).count();
        System.out.println("\nNumber of colors starting with '" + startingLetter + "': " + length);

        char startingLetterY = 'Y';
        length =color.stream().filter(sort ->sort.startsWith(String.valueOf(startingLetterY))).count();
        System.out.println("\nNumber of colors starting with '" + startingLetterY + "': " + length);
    }
}
