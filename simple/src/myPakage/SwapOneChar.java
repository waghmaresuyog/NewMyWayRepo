package myPakage;

public class SwapOneChar {


    public static void main(String[] args) {
        String name = "madam";
        String rev = "";
        for (int count = name.length() - 1; count >= 0; count--) {
            rev += name.charAt(count);
        }
        System.out.println(rev);
        if (name.equals(rev)) {
            System.out.println("The String is palindrome");
        } else {
            System.out.println("the given string is not palindrome");
        }
    }
}