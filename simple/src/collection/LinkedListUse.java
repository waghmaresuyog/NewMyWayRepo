package collection;

import java.util.*;

public class LinkedListUse {

    public void displayLinkedListUse() {
        // Linked list follow the index value ,duplicate are allow
        //allow null value , multiple datatype  are allow
        LinkedList linkedListOne = new LinkedList(Arrays.asList("suyog", "Anushree", "Deepak", "rajeshree", 30, "santosh"));
        //
        System.out.println(linkedListOne);
        // add element at first
        linkedListOne.addFirst("suyog waghmare");
        // add element at last
        linkedListOne.addLast("Suyog Waghmare");
        System.out.println(linkedListOne);
        //remove last element
        linkedListOne.removeLast();
        System.out.println(linkedListOne);
        // get the element last value from list
        System.out.println(linkedListOne.getLast());
    }


    public static void main(String[] args) {
        LinkedListUse linkedListUse = new LinkedListUse();
        linkedListUse.displayLinkedListUse();
        System.out.println("--------------- Iterator example below---------------");
        ArrayList arrayListOne = new ArrayList(Arrays.asList(10, 20, 30, 50, "Suyog", "Santosh", "Deepak"));
        //using Iterator methods we can get the data one by one
        Iterator iteratorArray = arrayListOne.iterator();
        while (iteratorArray.hasNext()) {
            System.out.println(iteratorArray.next());
        }
        System.out.println("-------------using List Iterator methods we can get the data one by one------");
        ListIterator objListIterator = arrayListOne.listIterator();
        while (objListIterator.hasNext()) {
            System.out.println(objListIterator.next());
        }
        // to print from last element using previous keyword
        System.out.println("-------------------------");
        while (objListIterator.hasPrevious()) {
            System.out.println(objListIterator.previous());
        }
    }
}
