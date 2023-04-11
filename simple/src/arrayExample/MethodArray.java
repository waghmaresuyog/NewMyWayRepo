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
        for (int count = 0; count < argumentArray.length; count++) {
            for (int countTwo = 0; countTwo < argumentArray.length; countTwo++) {
                System.out.print(argumentArray[count][countTwo] + "  ");
            }
            System.out.println(" ");
        }
    }
}
