package arrayExample;

import java.util.Arrays;

public class SimpleArray {

    public static void main(String[] args) {

        int ar[] = new int[2];
        ar[0] = 10;
        ar[1] = 20;
        System.out.println("Printing using toString method " + Arrays.toString(ar));
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
        String s[] = {"suyog", "prasad", "anushree", "deepak"};
        // printing array using for each loop
        for (String i : s) {
            System.out.println(i);
        }

    }
}
