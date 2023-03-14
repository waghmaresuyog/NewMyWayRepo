package myPakage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class CityLast {

	public static void main (String args[])
	{
		
	System.out.println("Hello");	
		String input [] [] =  {{"London","Newyork"},{"Newyork","Lima"},{"Lima","Sao Paulo"}};//create array and add city
		 ArrayList<String> AL = new ArrayList<>();// create object ofArrayList<> class to add value
		for (int i=0; i<input.length;i++)
		{
			for(int j=0; j<2;j++)
			{
				AL.add(input[i][j]);// add the value in AL it object of ArrayList<>
				
			}
		}
		
		Set<String> S= new LinkedHashSet<>(AL); // create object of LinkedHashSet<> 
		ArrayList<String> AL1 = new ArrayList<>(S);	 
		System.out.println(AL1.get(AL1.size()-1)); // print the last element of ArrayList<>
				
		
	} 
	
}
