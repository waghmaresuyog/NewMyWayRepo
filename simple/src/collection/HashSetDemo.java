package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        //HashSet Example you can use this to store the number of value
        Set<String> hashObj = new HashSet();
        //using <String> Method we can convert the data type of HasSet into String
        hashObj.add("Suyog");
        hashObj.add("Mallinath");
        hashObj.add("Anushree");
        hashObj.add("Deepak");
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
        for (String stringOne : hashObj) {
            System.out.println(stringOne);
        }
        // check the element in hash set or not
        System.out.println("hashlist contain anushree or not: --> " + hashObj.contains("Anushree"));
        if (hashObj.contains("Suyog")) {
            System.out.println("Suyog is present");
        } else {
            System.out.println("Suyog is absent ");
        }
    }
}
