package simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInput {
    public static void main(String[] args) throws IOException {
        // BufferReaderInput bu = new BufferReaderInput(new InputStreamReader(System.in));
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an number:");
        int a = Integer.parseInt(bu.readLine());
        System.out.println("The Number is : " + a);
        System.out.println("Enter Name:");
        String input = bu.readLine();
        System.out.println("Your Name is " + input);

        var in = 10;
        System.out.println(in);


    }

}
