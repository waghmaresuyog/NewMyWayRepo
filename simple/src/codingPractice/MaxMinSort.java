package codingPractice;

import java.util.Arrays;

public class MaxMinSort {

    public static int[] maxMinSort(int[] numbers, int length) {

        int temp[] = new int[length];
        int smallNumber = 0, largeNumber = length - 1;
        boolean flag = true;

        for (int index = 0; index < length; index++) {
            if (flag)
                temp[index] = numbers[largeNumber--];
            else
                temp[index] = numbers[smallNumber++];

            flag = !flag;
        }
        return temp;
    }

    public static void main(String[] args) {
        int numbers[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Original Array " + Arrays.toString(numbers));
        int result[];
        result = maxMinSort(numbers, numbers.length);
        System.out.println("New Array is  :  " + Arrays.toString(result));
    }
}