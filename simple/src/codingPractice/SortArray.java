package codingPractice;

public class SortArray {

    public static void main(String[] args) {
        int arrayNumber[] = new int[]{5, 2, 8, 7, 1};
        int temporary = 0;
        System.out.println("Elements of original array:");
        for (int index = 0; index < arrayNumber.length; index++) {
            System.out.print(arrayNumber[index] + " ");
        }
        for (int count = 0; count < arrayNumber.length; count++) {
            for (int index = count + 1; index < arrayNumber.length; index++) {
                if (arrayNumber[count] > arrayNumber[index]) {
                    temporary = arrayNumber[count];
                    arrayNumber[count] = arrayNumber[index];
                    arrayNumber[index] = temporary;
                }
            }
        }
        System.out.println(" Elements of array sorted in ascending order: ");
        for (int index = 0; index < arrayNumber.length; index++) {
            System.out.println(arrayNumber[index] + " ");
        }
    }
}
