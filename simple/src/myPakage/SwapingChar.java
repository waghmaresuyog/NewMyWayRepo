package myPakage;

public class SwapingChar {

    public String swapChar(String name)
    {   String word=name;
        return word;
    }

    public static void main(String[] args) {
        SwapingChar swapingChar = new  SwapingChar();
        swapingChar.swapChar("bbg");
        String result=swapingChar.swapChar("bbg");
        System.out.println(result);

    }
}
