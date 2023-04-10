package MediumProblem;

import java.util.Arrays;

public class SwapArray {
    private int temp;
    private int lastNumber;

    public void endSwap(int arrayOne[]) {
        lastNumber = arrayOne[arrayOne.length - 1];
        int i, m = 0, flag = 0;
        m = lastNumber / 2;
        if (lastNumber == 0 || lastNumber == 1) {
            System.out.println(lastNumber + " is not prime number" +
                    "  The array is :" + Arrays.toString(arrayOne));
        } else {
            for (i = 2; i <= m; i++) {
                if (lastNumber % i == 0) {
                    System.out.println(lastNumber + " is not prime number" +
                            "The array is :" + Arrays.toString(arrayOne));
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(lastNumber + " is prime number");
                temp = arrayOne[0];
                arrayOne[0] = lastNumber;
                arrayOne[arrayOne.length - 1] = temp;
                System.out.println("new array is : " + Arrays.toString(arrayOne));
            }
        }
    }

    public static void main(String[] args) {
        SwapArray swapArray = new SwapArray();
        int[] arrayOne = new int[]{1, 2, 3, 9};
        swapArray.endSwap(arrayOne);
    }
}
