package arrayListDemo;

import java.util.ArrayList;

public class FirstArraylist {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		ArrayList al2 = new ArrayList();
		al2.add("suyog");
		al2.add("anushree");
		al2.add("deepak");
		
		al.addAll(al2);
		
		System.out.println(al);
	}

}
