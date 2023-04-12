package MediumProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxCalculator {
    private float tax;

    public float IncomeTax(float income) {
        int slab = (income < 700000) ? 1 : (income > 500000 && income <= 1000000)
                ? 2 : (income <= 1500000) ? 3 : 4;
        switch (slab) {
            case 1:
                System.out.println(" your income is " + income + "  and you are tax free ");
                break;
            case 2:
                float taxableAmountTwo = income - 700000;
                tax = (0.15f) * taxableAmountTwo + (0.1F * 200000);
                System.out.println(" your income is " + income + "  Your are tax is 15 % :" + tax);
                break;
            case 3:
                float taxableAmountThree = income - 1000000;
                tax = (0.20f) * taxableAmountThree + (0.15F * 300000) + (0.1F * 200000);
                System.out.println(" your income is " + income + "  Your are tax is 20 % :" + tax);
                break;
            case 4:
                float taxableAmountFour = income - 1000000;
                tax = (0.30f) * taxableAmountFour + (0.2F * 500000) + (0.15F * 300000) + (0.1F * 200000);
                System.out.println(" your income is " + income + "  Your are tax is 30 % :" + tax);
                break;
            default:
                System.out.println("Enter valid income");
        }
        return tax;
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.IncomeTax(400000);// 0% tax free
        taxCalculator.IncomeTax(600000);
        taxCalculator.IncomeTax(900000);//15
        taxCalculator.IncomeTax(1200000);//20%
        taxCalculator.IncomeTax(1800000);//30 %
    }
}
