package codingPractice;

import java.util.Arrays;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        int nums[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(nums));
        int result[] ;
        result = filterEvenOdd(nums);
        System.out.println("Array after separation ");
        System.out.println(Arrays.toString(result));
        int sum=0;
        for (int index=0;index< result.length;index++){

            sum=sum+result[index];
        }
        System.out.println("Sum of array is "+sum);
    }

    public static int[] filterEvenOdd(int numberArray[]) {
        int leftSide = 0, rightSide = numberArray.length - 1;
        while (leftSide < rightSide) {
            while (numberArray[leftSide] % 2 == 0 && leftSide < rightSide)
                leftSide++;

            while (numberArray[rightSide] % 2 == 1 && leftSide < rightSide)
                rightSide--;

            if (leftSide < rightSide) {
                int temp = numberArray[leftSide];
                numberArray[leftSide] = numberArray[rightSide];
                numberArray[rightSide] = temp;
                leftSide++;
                rightSide--;
            }
        }
        return numberArray;
    }
}