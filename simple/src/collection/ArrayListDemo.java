package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {


        ArrayList al = new ArrayList<>(Arrays.asList(10, 20, "suyog", "deepak"));

        ArrayList al2 = new ArrayList();
        al2.add("suyog");
        al2.add("anushree");
        al2.add("deepak");
        al.addAll(al2);
        System.out.println(al);
        System.out.println("------------------------------- print using iterator method  ------------- ");
        // print using iterator method
        Iterator it = al.iterator();// it read element one by one
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
