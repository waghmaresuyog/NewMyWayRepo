package simple;

import java.util.Scanner;

public class ScannerAllDataType {

    public static void main(String[] args) {

        byte number;
        System.out.println("Enter byte");
        Scanner scannerInput = new Scanner(System.in);
        number = scannerInput.nextByte();
        System.out.println("Value of Byte is : " + number);
        System.out.println("-----------------------------------------");

        short shortNumber;
        System.out.println("Enter short value");
        shortNumber = scannerInput.nextShort();
        System.out.println("value of short is :" + shortNumber);
        System.out.println("------------------------------------------");

        int numberInt;
        System.out.println("Enter int value");
        numberInt = scannerInput.nextInt();
        System.out.println("value of int is :" + numberInt);
        System.out.println("------------------------------------------");
        char charAlpha;
        System.out.println("Enter char value");
        charAlpha = scannerInput.next().charAt(0);
        System.out.println("value of char is :" + charAlpha);
        System.out.println("------------------------------------------");

        String srtingName;
        System.out.println("Enter value of string");
        srtingName = scannerInput.next();
        System.out.println("value of string is : " + srtingName);
        System.out.println("-----------------------------------------------");
    }
}
