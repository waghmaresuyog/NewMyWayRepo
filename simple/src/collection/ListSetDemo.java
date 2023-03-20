package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListSetDemo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add("suyog");
		l.add("Deepak");
		l.add("Anushree");
		l.add("Anushree"); // duplicate is allow
		l.add(null);
		l.add(null);
		System.out.println(l);

		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("------------By using Set Method");
		// HashSet Example you can use this to store the number of value
		Set<String> s = new HashSet(); 
		// using <String> Method we can convert the data type of HasSet into String
		s.add("Suyog");
		s.add("Mallinath");
		s.add("Anushree");
		s.add("Deepak");// duplicate are not allow in Set
		s.add(null);
		s.add(null);
		for (String se : s) {
			System.out.println(se);
		}
		System.out.println("This is  set method " + s);
		Iterator st = s.iterator();
		while (st.hasNext()) {
			System.out.println(st.next());
		}

		System.out.println("hashlist contain anushree or not: --> " + s.contains("Anushree"));
		if (s.contains("Suyog")) {
			System.out.println("Suyog is present");
		} else {
			System.out.println("Suyog is absent ");
		}

		int arr[] = { 12, 13, 14, 44 };
		// traversing the array with for-each loop
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
