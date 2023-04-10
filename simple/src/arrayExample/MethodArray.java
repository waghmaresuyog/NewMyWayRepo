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
    public static void pringArray(int argumentArray[][]) {
        for (int i = 0; i < argumentArray.length; i++) {
            for (int j = 0; j < argumentArray.length; j++) {
                System.out.print(argumentArray[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
