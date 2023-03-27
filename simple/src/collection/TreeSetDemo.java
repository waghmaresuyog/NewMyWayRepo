package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet(Arrays.asList("Santosh", "Mayur", "Suyog", "Anushree", "Rana", "Suyog"));
        //same duplicate is not allow
        //ts.add(null);  //null not allow
        System.out.println(ts);

        TreeSet num = new TreeSet<>();
        num.add(500);
        num.add(200);
        num.add(400);
        num.add(100);
        System.out.println(num);
    }

}
