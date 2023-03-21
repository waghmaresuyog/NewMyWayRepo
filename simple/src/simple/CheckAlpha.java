package simple;

import java.util.Scanner;

public class CheckAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any key on keyboard ");
        char ch = sc.next().charAt(0);

        if(Character.isAlphabetic(ch))
        {
            System.out.println(ch+"  Is an alphabet.");
        }
        else {
            System.out.println(ch+"  Is NOT alphabet.");
        }
    }
}
