package MediumProblem;

public class StringMerge {
    public void merge(String nameOne, String nameTwo) {
        int lengthNameOne = 0, lengthNameTwo = 0;

        while (lengthNameOne < nameOne.length() || lengthNameTwo < nameTwo.length()) {
            if (lengthNameOne < nameOne.length()) {
                System.out.print(nameOne.charAt(lengthNameOne));
                lengthNameOne++;
            }
            if (lengthNameTwo < nameTwo.charAt(lengthNameTwo)) {
                System.out.print(nameTwo.charAt(lengthNameTwo));
                lengthNameTwo++;
            }
        }
    }

    public static void main(String[] args) {
        StringMerge stringMerge = new StringMerge();
        stringMerge.merge("HI", "there");
        System.out.println(" ");
        stringMerge.merge("abc", "xyz");
    }
}
