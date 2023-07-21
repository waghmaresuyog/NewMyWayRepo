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
        int left_side = 0, right_side = numberArray.length - 1;
        while (left_side < right_side) {
            while (numberArray[left_side] % 2 == 0 && left_side < right_side)
                left_side++;

            while (numberArray[right_side] % 2 == 1 && left_side < right_side)
                right_side--;

            if (left_side < right_side) {
                int temp = numberArray[left_side];
                numberArray[left_side] = numberArray[right_side];
                numberArray[right_side] = temp;
                left_side++;
                right_side--;
            }
        }
        return numberArray;
    }
}