package MediumProblem;

public class StringMerge {
    public String merge(String nameOne, String nameTwo) {
        int aLen = nameOne.length();
        int bLen = nameTwo.length();
        int max = Math.max(aLen, bLen);
        String word = "";
        for (int count = 0; count < max; count++) {
            if (count <= aLen - 1)
                word += nameOne.substring(count, count + 1);
            if (count <= bLen - 1)
                word += nameTwo.substring(count, count + 1);
        }
        return word;
    }

    public static void main(String[] args) {
        StringMerge stringMerge = new StringMerge();
        String word = stringMerge.merge("abc", "xyz");
        System.out.println(" this is new word: " + word);
    }
}
