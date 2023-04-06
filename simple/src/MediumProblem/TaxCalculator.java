package MediumProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxCalculator {
    private float tax;

    public float IncomeTax(float income) {
        int slab = (income < 500000) ? 0 : (500000 <= income && income <= 700000)
                ? 10 : (700000 <= income && income <= 1000000) ? 15 : (1000000 < income && income >= 1500000) ? 30 : 20;
        switch (slab) {
            case 0:
                System.out.println("you are tax free ");
                break;
            case 10:
                float taxableAmountOne = income - 500000;
                tax = (0.10f) * taxableAmountOne;
                System.out.println("Your are tax is :" + tax);
                System.out.println("you are in 10 %");
                break;
            case 15:
                float taxableAmountTwo = income - 700000;
                tax = (0.15f) * taxableAmountTwo + (0.1F * 200000);
                System.out.println("Your are tax is :" + tax);
                System.out.println("you are in 15 %");
                break;
            case 20:
                float taxableAmountThree = income - 1000000;
                tax = (0.20f) * taxableAmountThree + (0.15F * 300000) + (0.1F * 200000);
                System.out.println("Your are tax is :" + tax);
                System.out.println("you are in 20 %");
                break;
            case 30:
                float taxableAmountFour = income - 1000000;
                tax = (0.30f) * taxableAmountFour + (0.2F * 500000) + (0.15F * 300000) + (0.1F * 200000);
                System.out.println("Your are tax is :" + tax);
                System.out.println("you are in 30 %");
                break;
            default:
                System.out.println("Enter valid income");
        }
        return tax;
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.IncomeTax(600000);
        taxCalculator.IncomeTax(2200000);
    }
}
