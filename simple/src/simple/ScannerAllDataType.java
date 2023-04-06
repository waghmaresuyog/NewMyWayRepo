package simple;

import java.util.Scanner;

public class ScannerAllDataType {

    public void details() {
        String srtingName = "suyog";
        System.out.println("value of string is : " + srtingName);
        System.out.println("-----------------------------------------------");

        byte number = 22;
        System.out.println("Value of Byte is : " + number);
        System.out.println("-----------------------------------------");

        short shortNumber = 555;
        System.out.println("value of short is :" + shortNumber);
        System.out.println("------------------------------------------");

        int numberInt = 9999663;
        System.out.println("value of int is :" + numberInt);
        System.out.println("------------------------------------------");

        char charAlpha = '$';
        System.out.println("value of char is :" + charAlpha);
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        ScannerAllDataType scannerAllDataType = new ScannerAllDataType();
        scannerAllDataType.details();
    }
}
