package myPakage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class destinationCity {

	public static void main(String[] args) {
		destinationCity dC = new destinationCity();

		List<List<String>> input = Arrays.asList(Arrays.asList("London", "New York"), Arrays.asList("New York", "Lima"),
				Arrays.asList("Lima", "Sao Paulo"));
		System.out.println(dC.destCity(input));
	}

	public String destCity(List<List<String>> paths) // create methods for return the City
	{
		Set<String> outgoingPathCities = new HashSet<>();// create object of HashSet<> class to add city
		Set<String> cities = new HashSet<>(); // create object of HashSet<> class to add city
		// [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]

		for (List<String> path : paths) {
			outgoingPathCities.add(path.get(0)); // outgoing paths {{London,Newyork},{Newyork,Lima},{Lima, SaoPaulo}}
			cities.add(path.get(0));
			cities.add(path.get(1));
		}
		for (String city : cities) { // cities {{London,Newyork},{Newyork, Lima},{Lima,Sao Paulo}}
			if (!outgoingPathCities.contains(city)) {
				return city;
			}
		}
		return "";
	}
}
