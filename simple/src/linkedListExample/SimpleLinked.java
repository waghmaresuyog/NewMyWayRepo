package linkedListExample;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class SimpleLinked {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("Suyog"); // follow the index value
		ll.add("Anushree");
		ll.add("Deepak"); // duplicate are allow
		ll.add("Deepak");
		ll.add("rajeshree");
		ll.add(null); // allow null value
		ll.add(100);
		ll.add(20.25);// multipal datat type are allow
		System.out.println(ll);
		ll.addFirst("suyog waghmare");
		ll.addLast("Suyog Waghmare");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.getLast());// get the last value of
		System.out.println("-------------------------------------------- Iterator example below");

		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add("suyog");
		l.add("prasad");
		System.out.println(l);

		Iterator itr = l.iterator(); // using Iterator methods we can get the data one by one
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-------------using List Iterator methods we can get the data one by one------");
		ListIterator li = l.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		// System.out.println(li.previous());
		System.out.println("-------------------------");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
