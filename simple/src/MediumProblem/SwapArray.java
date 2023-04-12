package MediumProblem;

import java.util.Arrays;

public class SwapArray {
    private int temp;
    private int lastNumber;

    public void endSwap(int arrayOne[]) {
        lastNumber = arrayOne[arrayOne.length - 1];
        int  flag = 0;
        int mid = lastNumber / 2;
        for (int counter = 2; counter <= mid; counter++) {
            if (lastNumber % counter == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1 || lastNumber == 0 || lastNumber == 1) {
            System.out.println("Last number of array is : " + lastNumber + " is not prime so not swaped");
            System.out.println("new array is : " + Arrays.toString(arrayOne));
        } else {
            System.out.println("Array last element is : " + lastNumber + " And Number is prime");
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
