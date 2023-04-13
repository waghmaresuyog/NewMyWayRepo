package MediumProblem;

import java.util.Arrays;

public class SwapArray {
    private static int temp;
    private static int lastNumber;
    boolean flag = false;

    public static boolean isPrime(int number, int devisor) {
        if (number % devisor == 0) {
            return false;
        }
        if (devisor * devisor > number) {
            return true;
        }
        return isPrime(number, devisor + 1);
    }

    public void swapShow(int array[]) {
        lastNumber = array[array.length - 1];
        int midElement = 2;
        flag = isPrime(lastNumber, midElement);
        if (flag == true && lastNumber != 0 && lastNumber != 1) {
            System.out.println("Array last element is : " + lastNumber + "Number is prime");
            temp = array[0];
            array[0] = lastNumber;
            array[array.length - 1] = temp;
            System.out.println("new array is : " + Arrays.toString(array));
        } else {
            System.out.println("Last number of array is : " + lastNumber + " Not prime number so not swaped");
            System.out.println("new array is : " + Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        SwapArray swapArray = new SwapArray();
        int[] arrayOne = new int[]{1, 2, 3, 7};
        swapArray.swapShow(arrayOne);
    }
}