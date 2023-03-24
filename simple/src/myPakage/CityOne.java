package myPakage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CityOne {
    public static void main(String[] args) {
        List Test1 = new LinkedList<>();
        Test1.add("London");
		Test1.add("New York");
        List Test2 = new LinkedList<>();
		Test2.add("New York");
		Test2.add("Lima");
        List Test3 = new LinkedList<>();
		Test3.add("Lima");
		Test3.add("Sao Paulo");
        List<List<String>> testlist = new ArrayList<>();
        testlist.add(Test1);
        testlist.add(Test2);
        testlist.add(Test3);
        //System.out.print(testlist);
        String returnDestination = destinationCity(testlist);
        System.out.println("Destination City is : " + returnDestination);
    }
    private static String destinationCity(List<List<String>> path) {

        List<String> Out = new ArrayList<>();
        List<String> In = new ArrayList<>();

        for (int i = 0; i < path.size(); i++) {
            List<String> Element = path.get(i);
            String OutElement = Element.get(0);
            String InElement = Element.get(1);
			Out.add(OutElement);
			In.add(InElement);
        }
        for (int j = 0; j < Out.size(); j++) {
            //create local variable inElement
            String InElement = In.get(j);
            if (!Out.contains(InElement))
                return InElement;
        }
        return null;
    }
}
