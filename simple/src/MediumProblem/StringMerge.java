package MediumProblem;

public class StringMerge {
    public String merge(String nameOne, String nameTwo) {
        int aLen = 0;
        int bLen = 0;
        int max = Math.max(aLen, bLen);
        String word = "";
        while (aLen < nameOne.length() || bLen < nameTwo.length()) {
            if (aLen < nameOne.length()) {
                word += nameOne.charAt(aLen);
                aLen++;
            }
            if (bLen < nameTwo.charAt(bLen)) {
                word += nameTwo.charAt(bLen);
                bLen++;
            }
        }
        return word;
    }

    public static void main(String[] args) {
        StringMerge stringMerge = new StringMerge();
        String word = stringMerge.merge("abc", "xyz");
        System.out.println(" this is new word: " + word);
    }
}
