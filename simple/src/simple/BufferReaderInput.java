package simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInput {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an number:");
        int intNumber = Integer.parseInt(bufferInput.readLine());
        System.out.println("The Number is : " + intNumber);
        System.out.println("Enter Name:");
        String stringInput = bufferInput.readLine();
        System.out.println("Your Name is " + stringInput);
        var number = 10;
        System.out.println(number);
    }
}
