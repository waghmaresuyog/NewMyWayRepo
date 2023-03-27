package MediumProblem;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TacCalculator {
    static float tax;

    public static float IncomeTax(float income) {
        if (income <= 500000) {
            System.out.println("You are Tax free");
        } else if (income >= 500000 && income < 700000) {
            float Taxable_AmountOne = income - 500000;
            tax = (0.10f) * Taxable_AmountOne;
            System.out.println("Your are tax is :" + tax);
        } else if (income > 700000 && income <= 1000000) {
            float Taxable_AmountTwo = income - 700000;
            tax = (0.15f) * Taxable_AmountTwo + (0.1F * 200000);
            System.out.println("Your are tax is :" + tax);
        } else if (income > 1000000 && income <= 1500000) {
            float amu2 = income - 1000000;
            tax = (0.20f) * amu2 + (0.15F * 300000) + (0.1F * 200000);
            System.out.println("Your are tax is :" + tax);
        } else {
            float amu3 = income - 1000000;
            tax = (0.30f) * amu3 + (0.2F * 500000) + (0.15F * 300000) + (0.1F * 200000);
            System.out.println("Your are tax is :" + tax);
        }
        return tax;
    }

    public static void main(String[] args) throws IOException {

        float income;
        float tax;
        System.out.println("Enter your income ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        income = Float.parseFloat(input.readLine());
        IncomeTax(income);

    }

}
