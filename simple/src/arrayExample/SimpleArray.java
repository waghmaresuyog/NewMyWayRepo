package arrayExample;

import java.util.Arrays;

public class SimpleArray {

    public void displaySimpleArray()
    {
        int arrayOne[] = new int[2];
        arrayOne[0] = 10;
        arrayOne[1] = 20;
        System.out.println("Printing using toString method " + Arrays.toString(arrayOne));
        System.out.println("----------Using for loop print the another array----------------------");
        // Other way to use array
        int arrayTwo[] = {50, 60, 70, 80, 90};
        System.out.println("value of array is : ");
        for (int j = 0; j < arrayTwo.length; j++) {
            System.out.println(arrayTwo[j]);
        }
        System.out.println("------------using for each loop--------------------");
        String arrayString[] = {"suyog", "prasad", "anushree", "deepak"};
        // printing  using for each loop
        for (String temp : arrayString) {
            System.out.println(temp);
        }
        //traversing the array with for-each loop
        for (int intFor : arrayTwo) {
            System.out.println(intFor);
        }
    }
    public static void main(String[] args) {
        SimpleArray simpleArray = new SimpleArray();
        simpleArray.displaySimpleArray();
    }
}
