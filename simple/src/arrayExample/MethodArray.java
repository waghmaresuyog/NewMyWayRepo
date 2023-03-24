package arrayExample;
public class MethodArray {
    public static void main(String[] args) {
        int arr[][] = returnArray();
        pringArray(arr);
    }
    static int[][] returnArray() {
        int arr[][] = new int[][]{{5, 5}, {6, 6}};
        return arr;
    }
    static void pringArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
