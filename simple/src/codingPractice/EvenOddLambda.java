package codingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddLambda {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

        //print original number list
        System.out.println("Original Number is : ");
        for (int count : numberList) {
            System.out.print(count + " ");
        }

        // Filter out even numbers using lambda expression
        List<Integer> evenNumber = numberList.stream()
                .filter(n -> n % 2 == 0).collect(Collectors.toList());

        //print the even number of list
        //  System.out.println(" ");
        System.out.print("\n Even Number is ");
        for (int count : evenNumber) {
            System.out.print(count + " ");
        }

        // Filter out odd numbers using lambda expression
        List<Integer> oddNumbers = numberList.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        // print the odd number of list
        System.out.print("\n Odd number list is : ");
        for (int count : oddNumbers) {
            System.out.print(count + " ");
        }
    }
}
