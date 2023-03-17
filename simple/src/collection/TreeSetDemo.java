package collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add("Santosh");
		ts.add("Suyog");
		ts.add("Mayur");
		ts.add("Anushree");
		ts.add("Rana");
		//ts.add(100);
		//ts.add(200);		//same data type is allow 
		ts.add("Santosh");
		//ts.add(null);  //null not allow 
		
		System.out.println(ts);
		
		TreeSet num = new TreeSet<>();
		num.add(500);
		num.add(200);
		num.add(400);
		num.add(100);
		System.out.println(num);
	}

}
