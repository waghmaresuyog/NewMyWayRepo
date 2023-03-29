package MediumProblem;

import java.util.Arrays;

public class SwapArray {
    int temp;
    int lastNumber;
    boolean flag = false;
    public void endSwap(int arrayOne[]) {
        // find last value of array
        lastNumber = arrayOne[arrayOne.length - 1];
        for (int i = 2; i <= (lastNumber / 2); i++) {
            if (lastNumber % i == 0) {
                flag = true;
                System.out.println("The last Number is :" + lastNumber + "And it is not prime Number");
                break;
            }
        }
        //swap the array if last element is prime
        if (flag == false) {
            System.out.println("Array last element is : " + lastNumber + "   And Number is prime");
            temp = arrayOne[0];
            arrayOne[0] = lastNumber;
            arrayOne[arrayOne.length - 1] = temp;
            System.out.println("new array is : " + Arrays.toString(arrayOne));
        } else {
            System.out.println("Last number of array is :" + lastNumber + "is not prime so not swaped");
        }
    }
    public static void main(String[] args) {
        SwapArray swapArray = new SwapArray();
        int[] arrayOne = new int[]{1, 2, 3, 7};
        swapArray.endSwap(arrayOne);
    }
}

