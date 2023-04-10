package arrayExample;

import java.util.Arrays;

public class MultiArray {
    public void displayArray() {
        System.out.println("printing another array");
        //this is array is 3 row and 2 colum
        int collegeId[][] = {{10, 20}, {20, 30}, {20, 30}};
        System.out.println(collegeId[0].length);
        System.out.println(collegeId.length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(collegeId[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        MultiArray multiArray = new MultiArray();
        multiArray.displayArray();
    }
}
