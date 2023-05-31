package codingPractice;

public class RemoveDuplicateExample {
    public static int removeDuplicateElements(int arrayNumber[], int length) {
        if (length == 0 || length == 1) {
            return length;
        }
        int[] buffer = new int[length];

        int temporaryNumber = 0;
        for (int count = 0; count < length - 1; count++) {
            if (arrayNumber[count] != arrayNumber[count + 1]) {
                buffer[temporaryNumber++] = arrayNumber[count];
            }
        }
        buffer[temporaryNumber++] = arrayNumber[length - 1];
        // Changing original array
        for (int index = 0; index < temporaryNumber; index++) {
            arrayNumber[index] = buffer[index];
        }
        return temporaryNumber;
    }

    public static void main(String args[]) {
        int arrayNumber[] = {10, 20, 20, 30, 30, 40, 50, 50};
        int length = arrayNumber.length;
        length = removeDuplicateElements(arrayNumber, length);
        //printing array elements
        for (int index = 0; index < length; index++)
            System.out.print(arrayNumber[index] + " ");
    }
}