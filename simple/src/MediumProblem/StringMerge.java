package MediumProblem;

public class StringMerge {
    public String merge(String nameOne, String nameTwo) {
        int aLen = nameOne.length();
        int bLen = nameTwo.length();
        int max = Math.max(aLen, bLen);
        String word = "";
        for (int i = 0; i < max; i++) {
            if (i <= aLen - 1)
                word += nameOne.substring(i, i + 1);
            if (i <= bLen - 1)
                word += nameTwo.substring(i, i + 1);
        }
        return word;
    }

    public static void main(String[] args) {
        StringMerge stringMerge = new StringMerge();
        String word = stringMerge.merge("abc", "xyz");
        System.out.println(" this is new word: " + word);
    }
}
