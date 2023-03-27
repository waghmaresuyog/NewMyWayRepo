package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListUse {
    public static void main(String[] args) {
        //first arraylist
        ArrayList ArrayListOne = new ArrayList<>(Arrays.asList(30, 20, 40, 10));
        System.out.println("This is First Array list : " + ArrayListOne);
        // Second arratlist
        ArrayList ArrayListTwo = new ArrayList();
        ArrayListTwo.add("suyog");
        ArrayListTwo.add("anushree");
        ArrayListTwo.add("deepak");
        ArrayListOne.addAll(ArrayListTwo);
        System.out.println("------------------ print using iterator method  ------------- ");
        // print using iterator method  it read element one by one
        Iterator iterator = ArrayListOne.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
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
