package simple;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckAlpha {
    public static void main(String[] args) throws IOException {
       // Scanner sc = new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any key on keyboard ");
        char ch = (char) input.read();

        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + "  Is an alphabet.");
        } else {
            System.out.println(ch + "  Is NOT alphabet.");
        }
    }
}
