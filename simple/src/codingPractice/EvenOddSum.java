package codingPractice;

import java.util.List;

public class EvenOddSum {

    public static <T extends Number, numbers> void calculatorSum(List<T> numbers) {
        double evenSum = 0;
        double oddSum = 0;
        for (T number : numbers) {
            if (number.doubleValue() % 2 == 0) {
                evenSum += number.doubleValue();
            } else {
                oddSum += number.doubleValue();
            }
        }
        System.out.println("The original number of list is : " + numbers);
        System.out.println("sum of Even Number :  " + evenSum);
        System.out.println("sum of Odd Number is :  " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> integersList = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Double> doublesList = List.of(2.0, 1.5, 4.5, 2.5, 1.5);
        calculatorSum(integersList);
        calculatorSum(doublesList);
    }
}