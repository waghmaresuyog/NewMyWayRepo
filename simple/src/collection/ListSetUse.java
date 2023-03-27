package collection;

import java.util.*;

public class ListSetDemo {

    public static void main(String[] args) {

        ArrayList arrayListOne = new ArrayList(Arrays.asList("balaji", "santosh", "sushil", "amruta", "suyog"));
        System.out.println(arrayListOne);
        Iterator iterator = arrayListOne.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------By using Set Method-----------");
        // HashSet Example you can use this to store the number of value
        Set<String> hashSetOne = new HashSet(Arrays.asList("suyog", "Anushree", "Deepak", null, 10));
        System.out.println("This is  set method " + hashSetOne);
        Iterator iteratorHash = hashSetOne.iterator();
        while (iteratorHash.hasNext()) {
            System.out.println(iteratorHash.next());
        }
        System.out.println("hashlist contain suyog or not: --> " + hashSetOne.contains("suyog"));
        if (hashSetOne.contains("suyog")) {
            System.out.println("suyog is present");
        } else {
            System.out.println("suyog is absent ");
        }
        // traversing the array with for-each loop
        int arrayOne[] = {12, 13, 14, 44};
        for (int i : arrayOne) {
            System.out.println(i);
        }
    }
}
