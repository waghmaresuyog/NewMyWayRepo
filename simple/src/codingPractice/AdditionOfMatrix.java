package codingPractice;

public class AdditionOfMatrix {

    public static void main(String[] args) {
        int matrixFirst[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int matrixSecond[][] = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};
        System.out.println("Matrix First  elements is:");
        for (int row = 0; row < matrixFirst.length; row++) {
            for (int column = 0; column < matrixFirst[row].length; column++) {
                System.out.print(matrixFirst[row][column] + " ");
            }
            System.out.println(); // Print a new line after each row
        }

        System.out.println("Matrix Second  elements is:");
        for (int row = 0; row < matrixSecond.length; row++) {
            for (int column = 0; column < matrixSecond[row].length; column++) {
                System.out.print(matrixSecond[row][column] + " ");
            }
            System.out.println(); // Print a new line after each row
        }
        System.out.println("Addition of matrices");
        add(matrixFirst, matrixSecond);
    }

    public static void add(int matrixFirst[][], int matrixSecond[][]) {

        int sumOfMatrix[][] = new int[3][3];
        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                //Addiction fo Two Matrix
                sumOfMatrix[rowIndex][columnIndex] = matrixFirst[rowIndex][columnIndex]
                        + matrixSecond[rowIndex][columnIndex];
                System.out.print(sumOfMatrix[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }
}