package MediumProblem;

public class StringMerge {
    public String merge(String nameOne, String nameTwo) {
        int lengthNameOne = 0, lengthNameTwo = 0;
        String string = "";

        while (lengthNameOne < nameOne.length() || lengthNameTwo < nameTwo.length()) {
            if (lengthNameOne < nameOne.length()) {
                System.out.print(nameOne.charAt(lengthNameOne));
                string += string+nameOne.charAt(lengthNameOne);
                lengthNameOne++;
            }
            if (lengthNameTwo < nameTwo.charAt(lengthNameTwo)) {
                System.out.print(nameTwo.charAt(lengthNameTwo));
                string += string+nameTwo.charAt(lengthNameTwo);
                lengthNameTwo++;
            }
        }
        return string;
    }

    public static void main(String[] args) {
        StringMerge stringMerge = new StringMerge();
        stringMerge.merge("HI", "there");
        System.out.println(" ");
        String word =  stringMerge.merge("abc", "xyz");
        System.out.println(" this is from word: "+word);
    }
}
