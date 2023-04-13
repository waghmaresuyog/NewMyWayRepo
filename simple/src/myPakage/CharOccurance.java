package myPakage;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CharOccurance {

    public static void main(String[] args) {
        boolean output = equalNumOccurance("aabccdd");
        if (output)
            System.out.println("All Characters Have equal Number of Occurrences");
        else
            System.out.println("All Characters Have not equal Number of Occurrences");
    }

    public static boolean equalNumOccurance(String input) {
        Map<Character, Integer> countOccurances = new TreeMap<Character, Integer>();
        char[] chars = input.toCharArray();
        for (char count : chars) {
            if (countOccurances.get(count) != null) {
                countOccurances.put(count, countOccurances.get(count) + 1);
            } else{
                countOccurances.put(count, 1);
            }
        }
        Set<Integer> integerSet = new LinkedHashSet();
        integerSet.addAll(countOccurances.values());
        if (integerSet.size() == 1) {
            return true;
        } else {
            return false;
        }
    }
}
