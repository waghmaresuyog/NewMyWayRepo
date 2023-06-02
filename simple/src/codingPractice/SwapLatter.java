package codingPractice;

public class SwapLatter {
    public static void main(String[] args) {
        String swapName = "suyog waghmare";
        System.out.println("the Original string is " + swapName);
        SwapLatter swapLatter = new SwapLatter();
        System.out.println(swapLatter.swap(swapName, 0, 7));
        char newString[] = swapLatter.swap(swapName, 0, 6);
        System.out.println(newString);
    }

    public char[] swap(String swapName, int indexOne, int indexTwo) {
        char charSwap[] = swapName.toCharArray();
        char tempChar = charSwap[indexOne];
        charSwap[indexOne] = charSwap[indexTwo];
        charSwap[indexTwo] = tempChar;
        return charSwap;
    }
}
