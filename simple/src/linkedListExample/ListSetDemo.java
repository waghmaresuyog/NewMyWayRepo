package linkedListExample;

import java.awt.List;
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
		l.add("Anushree"); //duplicate is allow
		l.add(null);
		l.add(null);
		System.out.println(l);
		
		Iterator it = l.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------------By using Set Method");
		
		
		Set s = new HashSet();
		
		s.add("Deepak");
		s.add("Mallinath");
		s.add("Anushree");
		s.add("Anushree");//duplicate are not allow in Set 
		s.add(null);
		s.add(null);
		
		System.out.println(s);
		
		
	}

}
