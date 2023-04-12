package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListUse {
    public static ArrayList arrayDetail() {
        ArrayList arrayListMethod = new ArrayList(Arrays.asList(1000, 2000, 9999));

        return arrayListMethod;
    }

    public static void arrayListOneDisplay() {
        ArrayList arrayListOne = new ArrayList<>(Arrays.asList(30, 20, 40, 10));
        System.out.println("This is First Array list from method : " + arrayListOne);
        // Second arratlist
        ArrayList ArrayListTwo = new ArrayList();
        ArrayListTwo.add("suyog");
        ArrayListTwo.add("anushree");
        ArrayListTwo.add("deepak");
        arrayListOne.addAll(ArrayListTwo);
        System.out.println("------------------ print using iterator method by calling method ------------- ");
        // print using iterator method  it read element one by one
        Iterator iterator = arrayListOne.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void display(ArrayList ArrayListThree) {
        System.out.println("Array List using Method :");
        Iterator iterator = ArrayListThree.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(Arrays.asList(arrayDetail()));
        System.out.println(arrayList);// using method pring the array list .
        arrayListOneDisplay();// calling method to print arraylist
        // adding arraylist value in single line
        System.out.println("by passing value in single line is : ");
        //adding value in array list three
        ArrayList ArrayListThree = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println(ArrayListThree);// print array list
        display(ArrayListThree);// calling ArrayListThree using method
    }
}