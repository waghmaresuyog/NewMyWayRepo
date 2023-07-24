package codingPractice;

import java.util.Arrays;
import java.util.Random;

public class RandomShuffle {

    public static void main(String[] args) {
        int []numbers={1,2,3,4,5,6,7};
        System.out.println("Original Array: "+ Arrays.toString(numbers));
        shuffle(numbers);
        System.out.println("Shuffle Array: "+Arrays.toString(numbers));
    }

    public static void shuffle(int []numbers){
        for (int index = numbers.length - 1; index >= 1; index--)
        {
            Random rand = new Random();

            int count = rand.nextInt(index + 1);

            swap_elements(numbers, index, count);
        }
    }

    private static void swap_elements(int[] numbers, int index, int count) {
        int temp = numbers[index];
        numbers[index] = numbers[count];
        numbers[count] = temp;
    }
}
