package myPakage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindDestinationCity {
    public static void main(String[] args) {
        List<List<String>> inputCity = Arrays.asList(Arrays.asList("London", "New York"), Arrays.asList("New York", "Lima"),
                Arrays.asList("Lima", "Sao Paulo"));
        String returnDestination = destinationCity(inputCity);
        System.out.println("Destination City is : " + returnDestination);
    }

    private static String destinationCity(List<List<String>> path) {
        List<String> outCityElement = new ArrayList<>();
        List<String> inCityElement = new ArrayList<>();
        for (int index = 0; index < path.size(); index++) {
            List<String> Element = path.get(index);
            String outElement = Element.get(0);
            String inElement = Element.get(1);
            outCityElement.add(outElement);
            inCityElement.add(inElement);
        }
        for (int count = 0; count < outCityElement.size(); count++) {
            //create local variable inElement
            String inElement = inCityElement.get(count);
            if (!outCityElement.contains(inElement))
                return inElement;
        }
        return null;
    }
}
