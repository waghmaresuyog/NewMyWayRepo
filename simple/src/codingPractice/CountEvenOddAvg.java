package codingPractice;

import java.util.Arrays;

public class CountEvenOddAvg {

    public static void main(String[] args) {
        int[] array_nums = {5, 7, 2, 4, 9};
        System.out.println("Original Array: " + Arrays.toString(array_nums));
        System.out.println("Number of even numbers : " + CheckEven(array_nums));
        System.out.println("Number of odd numbers  : " + (array_nums.length - CheckEven(array_nums)));
        System.out.println("Average value of the array elements is : " + checkAverage(array_nums));

    }

    public static int CheckEven(int[] array_nums) {
        int evenCount = 0;
        for (int index = 0; index < array_nums.length; index++) {
            if (array_nums[index] % 2 == 0)
                evenCount++;
        }
        return evenCount;
    }

    public static double checkAverage(int[] array_nums) {
        int sum = 0;
        for (int index = 0; index < array_nums.length; index++)
            sum = sum + array_nums[index];
        //calculate average value
        double average = sum / array_nums.length;
        return average;
    }
}