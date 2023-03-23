package myPakage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CityOne {

	public static void main(String[] args) {
	List test1 = new LinkedList<>(); 
	test1.add("London");
	test1.add("New York");
	List test2 = new LinkedList<>();
	test2.add("New York");
	test2.add("Lima");
	List test3 = new LinkedList<>();
	test3.add("Lima");
	test3.add("Sao Paulo");
	List<List<String>> testlist = new ArrayList<>();
	testlist.add(test1);
	testlist.add(test2);
	testlist.add(test3);
	//System.out.print(testlist);
	String returnDestination = destinationCity(testlist);
	System.out.println("Destination City is : "+returnDestination);
		
	}

	private static String destinationCity(List<List<String>> path) {
		
		List<String> out = new ArrayList<>();
		List<String> in = new ArrayList<>();
		
		for (int i=0; i<path.size();i++)
		{
			List <String> element = path.get(i);
			String OutElement = element.get(0);
			String InElement = element.get(1);
			out.add(OutElement);
			in.add(InElement);
		}
		for (int j=0; j<out.size();j++)	
		{
			//create local variable inElement
			String inElement =in.get(j);
			if(!out.contains(inElement))
			return inElement;
		}
		return null;
	}
}
