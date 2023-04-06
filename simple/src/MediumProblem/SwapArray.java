package MediumProblem;

import java.util.Arrays;

public class SwapArray {
    private int temp;
    private int lastNumber;

    public void endSwap(int arrayOne[]) {
        // find last value of array
        int flag = 0;
        lastNumber = arrayOne[arrayOne.length - 1];

        if (lastNumber % 2 == 0) {
            flag = flag + 1;
            System.out.println("this is not a prime number");
        } else {
            System.out.println("Array last element is : " + lastNumber + "   And Number is prime");
            temp = arrayOne[0];
            arrayOne[0] = lastNumber;
            arrayOne[arrayOne.length - 1] = temp;
            System.out.println("new array is : " + Arrays.toString(arrayOne));
        }
    }

    public static void main(String[] args) {
        SwapArray swapArray = new SwapArray();
        int[] arrayOne = new int[]{1, 2, 3, 7};
        swapArray.endSwap(arrayOne);
    }
}
