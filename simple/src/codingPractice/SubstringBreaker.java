package codingPractice;

import java.util.HashSet;
import java.util.Set;

public class SubstringBreaker {
    public static int countUnusedCharacters(String stringWord, String[] dictionary) {
        Set<String> dictSet = new HashSet<>();
        for (String word : dictionary) {   // adding the word in dictSte from dictionary
            dictSet.add(word);
        }

        int length = stringWord.length();
        //represents the number of unused characters at index
        int unuseChar[] = new int[length + 1];

        for (int index = 1; index <= length; index++) {   // consider the current character as unused by default
            unuseChar[index] = unuseChar[index - 1] + 1;

            for (int count = 0; count < index; count++) {
                String subString = stringWord.substring(count, index);
                if (dictSet.contains(subString)) {
                    // update unuseChar[index] if a valid substring is found
                    unuseChar[index] = Math.min(unuseChar[index], unuseChar[count]);
                }
            }
        }
        return unuseChar[length];
    }

    public static void main(String[] args) {
        String stringWord = "darwinsbox";
        String[] dictionary = {"darwin", "box", "darwinbox"};
        int result = countUnusedCharacters(stringWord, dictionary);
        System.out.println(result);
    }
}