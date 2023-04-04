package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetUse {

    public static void contain(Set hashObj)
    {
        // check the element in hash set or not
        System.out.println("hashlist contain Suyog  or not: --> " + hashObj.contains("Suyog"));
        if (hashObj.contains("Suyog")) {
            System.out.println("Suyog is present");
        } else {
            System.out.println("Suyog is absent ");
        }
    }
    public static void main(String[] args) {

        Set hashObj = new HashSet(Arrays.asList("Suyog","Mallinath","Anushree","Deepak"));
        //using <String> Method we can convert the data type of HasSet into String
        //duplicate are not allow in Set
        hashObj.add(null);
        hashObj.add(null);
        System.out.println("This is  set method " + hashObj);
        // using Iterator method print the hash set
        Iterator steIterator = hashObj.iterator();
        while (steIterator.hasNext()) {
            System.out.println(steIterator.next());
        }
        //using for each loop print the hash set
        for (Object stringOne : hashObj) {
            System.out.println(stringOne);
        }
        contain(hashObj);// calling method for check element
    }
}
