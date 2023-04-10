package arrayExample;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        System.out.println("printing another array");
        //this is array is 3 row and 2 colum
        int arrayId[][] = {{10, 20}, {20, 30}, {20, 30}};
        System.out.println(arrayId[0].length);
        System.out.println(arrayId.length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arrayId[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
