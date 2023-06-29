package codingPractice;

public class ReverseWords {

    public static String reverseWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int index = words.length - 1; index >= 0; index--) {
            reversed.append(words[index]).append(" ");
        }
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "the sky is blue";
        System.out.println("The original Sentence is :" + sentence);
        String reversedWords = reverseWords(sentence);
        System.out.println("After Replacing in reverse order ");
        System.out.println(reversedWords);
    }
}