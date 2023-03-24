package arrayExample;

import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) {
        int ArrayOne[] = new int[2];
        ArrayOne[0] = 10;
        ArrayOne[1] = 20;
        System.out.println("Printing using toString method " + Arrays.toString(ArrayOne));
        System.out.println("--------------------------------");
        System.out.println("Using for loop print the another array ");
        // Other way to use array
        int a[] = {50, 60, 70, 80, 90};
        System.out.println("value of array is : ");
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
        System.out.println("--------------------------------");
        System.out.println("using for each loop");// using for each loop
        String ArrayString[] = {"suyog", "prasad", "anushree", "deepak"};
        // printing array using for each loop
        for (String Temp : ArrayString) {
            System.out.println(Temp);
        }
    }
}
