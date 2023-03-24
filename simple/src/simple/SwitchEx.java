package simple;

import java.util.Scanner;

public class SwitchEx {

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number up to ");
        num = sc.nextInt();
        switch (num) {
            case 5:
                System.out.println("you are tax free");
                break;
            case 7:
                System.out.println("you are eligible for 5% tax");
                break;
            case 10:
                System.out.println("you are eligible fro 10% tax");
            case 15:
                System.out.println("you are eligible for 15%");
        }
    }
}
