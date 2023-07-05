package codingPractice;

public class Solution {
    public static void main(String[] args) {
        int[][] twoDArray = {{10, 20, 30}, {40, 50, 60}};
        System.out.println("Original Array : \n ");
        printArray(twoDArray);
        System.out.print("After changing the rows and columns of the said array:\n");
        changeArray(twoDArray);
    }

    private static void changeArray(int[][] twoDArray) {
        int[][] newTwoDArray = new int[twoDArray[0].length][twoDArray.length];
        for (int index = 0; index < twoDArray.length; index++) {
            for (int count = 0; count < twoDArray[0].length; count++) {
                newTwoDArray[count][index] = twoDArray[index][count];
            }
        }
        printArray(newTwoDArray);
    }

    private static void printArray(int[][] twoDArray) {
        for (int index = 0; index < twoDArray.length; index++) {
            for (int count = 0; count < twoDArray[0].length; count++) {
                System.out.print(twoDArray[index][count] + " ");
            }
            System.out.println();
        }
    }
}
