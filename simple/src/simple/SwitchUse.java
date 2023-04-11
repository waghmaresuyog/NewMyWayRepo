package simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchUse {
    public void switchCheck(int caseNumber) {
        switch (caseNumber) {
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
    public static void main(String[] args) throws IOException {
        int number;
        BufferedReader bufferInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Any Case Number from this :5,7,10,15");
        number = Integer.parseInt(bufferInput.readLine());
        SwitchUse switchEx = new SwitchUse();
        switchEx.switchCheck(number);
    }
}
