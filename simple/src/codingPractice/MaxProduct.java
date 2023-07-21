package codingPractice;

import java.util.Arrays;

public class MaxProduct {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, -7, 5, 8, -5};
        System.out.println("\nOriginal array: " + Arrays.toString(numbers));
        findMaxProduct(numbers);
    }

    public static void findMaxProduct(int[] numbers) {
        int maxPairProduct = Integer.MIN_VALUE;
        int maxFirst = -1, maxSecond = -1;

        for (int index = 0; index < numbers.length - 1; index++) {
            for (int conut = index + 1; conut < numbers.length; conut++) {
                if (maxPairProduct < numbers[index] * numbers[conut]) {
                    maxPairProduct = numbers[index] * numbers[conut];
                    maxFirst = index;
                    maxSecond = conut;
                }
            }
        }

        System.out.print("Pair is (" + numbers[maxFirst] + ", " + numbers[maxSecond] + ")," +
                " Maximum Product: " + (numbers[maxFirst] * numbers[maxSecond]));
    }
}



