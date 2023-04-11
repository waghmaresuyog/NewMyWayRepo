package arrayExample;

import java.util.Arrays;

public class MultiArray {
    public void displayArray() {
        System.out.println("printing another array");
        //this is array is 3 row and 2 colum
        int collegeId[][] = {{10, 20}, {20, 30}, {50, 90}};
        System.out.println(collegeId[0].length);
        System.out.println(collegeId.length);
        for (int rowCount = 0; rowCount < 3; rowCount++) {
            for (int colCount = 0; colCount < 2; colCount++) {
                System.out.print(collegeId[rowCount][colCount] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        MultiArray multiArray = new MultiArray();
        multiArray.displayArray();
    }
}
