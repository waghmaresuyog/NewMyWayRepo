package myPakage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class CityLast {

	public static void main (String args[])
	{
		
	System.out.println("Hello");	
		String input [] [] =  {{"London","Newyork"},{"Newyork","Lima"},{"Lima","Sao Paulo"}};
		 ArrayList<String> AL = new ArrayList<>();
		for (int i=0; i<input.length;i++)
		{
			for(int j=0; j<2;j++)
			{
				AL.add(input[i][j]);
				
			}
		}
		
		Set<String> S= new LinkedHashSet<>(AL);
		ArrayList<String> AL1 = new ArrayList<>(S);
		System.out.println(AL1.get(AL1.size()-1));
				
		
	} 
	
}
