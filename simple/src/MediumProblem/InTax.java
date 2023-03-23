package MediumProblem;

import java.util.Scanner;

public class InTax {
    static float tax;

    public static float ITax(float income)
    {
        if(income<=500000)
        {
            System.out.println("You are Tax free");
        } else if (income>=500000 && income<700000) {
            float amu = income-500000;
            tax=(0.10f)*amu;
            System.out.println("Your are tax is :"+ tax);
        } else if (income>700000 && income<=1000000) {
            float amu1 = income-700000;
            tax=(0.15f)*amu1 +(0.1F * 200000);
            System.out.println("Your are tax is :"+ tax);
        } else if (income>1000000 && income<=1500000) {
            float amu2 = income-1000000;
            tax=(0.20f)*amu2 + (0.15F * 300000) +(0.1F * 200000);
            System.out.println("Your are tax is :"+ tax);
        }else {
            float amu3 = income-1000000;
            tax=(0.30f)*amu3 +(0.2F * 500000)+ (0.15F * 300000) +(0.1F * 200000);
            System.out.println("Your are tax is :"+ tax);
        }
        return tax;
    }
    public static void main(String[] args) {

        float income;
        float tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income ");
        income = sc.nextFloat();
        //InTax T= new InTax(income);
        ITax(income);

//        if(income<=500000)
//        {
//            System.out.println("You are Tax free");
//        } else if (income>=500000 && income<700000) {
//            float amu = income-500000;
//            tax=(0.10f)*amu;
//            System.out.println("Your are tax is :"+ tax);
//        } else if (income>700000 && income<=1000000) {
//            float amu1 = income-700000;
//            tax=(0.15f)*amu1;
//            System.out.println("Your are tax is :"+ tax);
//        } else if (income>1000000 && income<=1500000) {
//            float amu2 = income-1000000;
//            tax=(0.20f)*amu2;
//            System.out.println("Your are tax is :"+ tax);
//        }else {
//            float amu3 = income-1000000;
//            tax=(0.30f)*amu3;
//            System.out.println("Your are tax is :"+ tax);
//
//        }
    }

}
