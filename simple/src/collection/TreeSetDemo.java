package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //same duplicate is not allow
        //null not allow
        TreeSet treeSetOne = new TreeSet(Arrays.asList("Santosh", "Mayur", "Suyog", "Anushree", "Rana", "Suyog"));
        System.out.println(treeSetOne);
        TreeSet number = new TreeSet<>();
        number.add(500);
        number.add(200);
        number.add(400);
        number.add(100);
        System.out.println(number);
    }
}
