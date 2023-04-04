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

    public static void arraylistOnePint() {
        ArrayList ArrayListOne = new ArrayList<>(Arrays.asList(30, 20, 40, 10));
        System.out.println("This is First Array list from method : " + ArrayListOne);
        // Second arratlist
        ArrayList ArrayListTwo = new ArrayList();
        ArrayListTwo.add("suyog");
        ArrayListTwo.add("anushree");
        ArrayListTwo.add("deepak");
        ArrayListOne.addAll(ArrayListTwo);
        System.out.println("------------------ print using iterator method by calling method ------------- ");
        // print using iterator method  it read element one by one
        Iterator iterator = ArrayListOne.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void display(ArrayList ArrayListThree) {
        System.out.println("Array List using Method :");
        Iterator iteratorObj = ArrayListThree.iterator();
        while (iteratorObj.hasNext()) {
            System.out.println(iteratorObj.next());
        }
    }

    public static void main(String[] args) {
        ArrayList newArraylist = new ArrayList(Arrays.asList(arrayDetail()));
        System.out.println(newArraylist);// using method pring the array list .
        arraylistOnePint();// calling method to print arraylist
        // adding arraylist value in single line
        System.out.println("by passing value in single line is : ");
        //adding value in array list three
        ArrayList ArrayListThree = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println(ArrayListThree);// print array list
        display(ArrayListThree);// calling ArrayListThree using method
    }
}
