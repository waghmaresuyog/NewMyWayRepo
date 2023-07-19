package codingPractice;

import java.util.Arrays;

public class CheckSum {
    public static void main(String[] args) {
        int[] arrayNumbers = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array is " + Arrays.toString(arrayNumbers));
        int searchNum = 10;
        int fixedSum = 30;
        System.out.println("The Result is :" + result(arrayNumbers, searchNum, fixedSum));
    }

    public static boolean result(int[] arrayNumbers, int searchNum, int fixedSum) {

        int tempSum = 0;
        for (int number : arrayNumbers) {
            if (number == searchNum) {
                tempSum += searchNum;
            }
            if (tempSum > fixedSum) {
                break;
            }
        }
        return tempSum == fixedSum;
    }
}