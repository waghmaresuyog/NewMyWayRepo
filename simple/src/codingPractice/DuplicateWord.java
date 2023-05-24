package codingPractice;

public class DuplicateWord {

    public static void checkDuplicateWord(String sentence) {
        int count;
        //Converts the string into lowercase
        sentence = sentence.toLowerCase();
        //Split the string into words using built-in function
        String words[] = sentence.split(" ");
        System.out.println("Duplicate words in a given string : ");
        for (int index = 0; index < words.length; index++) {
            count = 1;
            for (int indexCopy = index + 1; indexCopy < words.length; indexCopy++) {
                if (words[index].equals(words[indexCopy])) {
                    count++;
                    //Set words[indexCopy] to 0 to avoid printing visited word
                    words[indexCopy] = "0";
                }
            }
            //Displays the duplicate word if count is greater than 1
            if (count > 1 && words[index] != "0")
                System.out.println(words[index]);
        }
    }

    public static void main(String[] args) {
        String sentence = "Big black bug bit a big black dog on his big black nose";
        DuplicateWord.checkDuplicateWord(sentence);
    }
}
