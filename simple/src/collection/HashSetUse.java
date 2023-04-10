package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetUse {
    public static void contain(Set hashRecord) {
        // check the element in hash set or not
        System.out.println("hashlist contain Suyog  or not: --> " + hashRecord.contains("Suyog"));
        if (hashRecord.contains("Suyog")) {
            System.out.println("Suyog is present");
        } else {
            System.out.println("Suyog is absent ");
        }
    }
    public static void main(String[] args) {
        Set hashRecord = new HashSet(Arrays.asList("Suyog", "Mallinath", "Anushree", "Deepak"));
        //using <String> Method we can convert the data type of HasSet into String
        //duplicate are not allow in Set
        hashRecord.add(null);
        hashRecord.add(null);
        System.out.println("This is  set method " + hashRecord);
        // using Iterator method print the hash set
        Iterator steIterator = hashRecord.iterator();
        while (steIterator.hasNext()) {
            System.out.println(steIterator.next());
        }
        //using for each loop print the hash set
        for (Object stringOne : hashRecord) {
            System.out.println(stringOne);
        }
        contain(hashRecord);// calling method for check element
    }
}
