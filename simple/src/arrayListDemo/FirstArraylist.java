package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FirstArraylist {

    public static void main(String[] args) {
        //first arraylist
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        // Second arratlist
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
        // adding arraylist value in single line
        System.out.println("by passing value in single line is : ");
        ArrayList TestArray = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println(TestArray);
        Iterator itrTest = TestArray.iterator();

        while (itrTest.hasNext()) {
            System.out.println(itrTest.next());
        }
    }
}
