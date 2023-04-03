package MediumProblem;

import java.util.Arrays;

public class SwapArray {
    int temp;
    int lastNumber;
    public void endSwap(int arrayOne[]) {
        // find last value of array
        int flag = 0;
        lastNumber = arrayOne[arrayOne.length - 1];
        for (int i = 2; i <= (lastNumber -1); i++) {
            if (lastNumber % i == 0) {
                flag = flag+1;
            }
        }
        //swap the array if last element is prime
        if (flag >0) {
            System.out.println("The last Number is :" + lastNumber + "  And it is not prime Number");
        }
        else {
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

