package arrayExample;

import java.util.Arrays;

public class MultiArray {

    public static void main(String[] args) {

        int a[][] = {{1, 2}, {2, 3}, {3, 3}};
        System.out.println("Passing value in array in single line and print it ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
		System.out.println("printing another array");
        int b[][] = {{10, 20}, {20, 30}, {20, 30}};//this is array is 3 row and 2 colum
        System.out.println(b.length);
        System.out.println(b[0].length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

}
