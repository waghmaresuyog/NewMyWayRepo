package myPakage;

public class CharEq {

    public static void main(String[] args) {

        String input = "abacbc";
        char searchOne = 'a'; // Character to search is 'a'.
        char searchTwo = 'b'; // Character to search is 'b'.
        char searchThree = 'c'; // Character to search is 'c'.
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == searchOne)
                countOne++;
            else if (input.charAt(i) == searchTwo)
                countTwo++;
            else if (input.charAt(i) == searchThree)
                countThree++;
        }
        if ((countOne == countTwo) && (countTwo == countThree)) {
            System.out.println("All Characters Have Equal Number of Occurrences");
        } else {
            System.out.println("All Characters Have Different Number of Occurrences");
        }
    }
}
