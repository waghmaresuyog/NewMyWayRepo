package arrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FirstArraylist {
    public static void main(String[] args) {
        //first arraylist
        ArrayList ArrayListOne = new ArrayList<>(Arrays.asList(30, 20, 40, 10));

        // Second arratlist
        ArrayList ArrayListTwo = new ArrayList();
        ArrayListTwo.add("suyog");
        ArrayListTwo.add("anushree");
        ArrayListTwo.add("deepak");

        ArrayListOne.addAll(ArrayListTwo);
        System.out.println("This is First Array list : " + ArrayListOne);
        System.out.println("------------------------------- print using iterator method  ------------- ");
        // print using iterator method
        Iterator it = ArrayListOne.iterator();// it read element one by one
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // adding arraylist value in single line
        System.out.println("by passing value in single line is : ");
        ArrayList ArrayListThree = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println(ArrayListThree);
        Iterator iteratorObj = ArrayListThree.iterator();
        while (iteratorObj.hasNext()) {
            System.out.println(iteratorObj.next());
        }
    }
}
