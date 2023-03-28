package arrayExample;

public class MethodArray {
    public static void main(String[] args) {
        int arrayValue[][] = returnArray();
        pringArray(arrayValue);
    }
    public static int[][] returnArray() {
        int arrayValue[][] = new int[][]{{5, 5}, {6, 6}};
        return arrayValue;
    }
    public static void pringArray(int paraArray[][]) {
        for (int i = 0; i < paraArray.length; i++) {
            for (int j = 0; j < paraArray.length; j++) {
                System.out.print(paraArray[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
