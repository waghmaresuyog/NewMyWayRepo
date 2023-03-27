package simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SwitchEx {

    public static void main(String[] args) throws IOException {

        int num;
        BufferedReader bufferInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number up to ");
        num = Integer.parseInt(bufferInput.readLine());
        switch (num) {
            case 5:
                System.out.println("you are tax free");
                break;
            case 7:
                System.out.println("you are eligible for 5% tax");
                break;
            case 10:
                System.out.println("you are eligible fro 10% tax");
            case 15:
                System.out.println("you are eligible for 15%");
        }
    }
}
