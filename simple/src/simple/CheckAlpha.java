package simple;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckAlpha {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any key on keyboard ");
        char charInput = (char) bufferInput.read();
        if (Character.isAlphabetic(charInput)) {
            System.out.println(charInput + "  Is an alphabet.");
        } else {
            System.out.println(charInput + "  Is NOT alphabet.");
        }
    }
}
