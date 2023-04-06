package myPakage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindDestinationCity {
    public static void main(String[] args) {
        List pairOne = new LinkedList<>();
        pairOne.add("London");
        pairOne.add("New York");
        List PairTwo = new LinkedList<>();
        PairTwo.add("New York");
        PairTwo.add("Lima");
        List pairThree = new LinkedList<>();
        pairThree.add("Lima");
        pairThree.add("Sao Paulo");
        List<List<String>> commonPair = new ArrayList<>();
        commonPair.add(pairOne);
        commonPair.add(PairTwo);
        commonPair.add(pairThree);
        String returnDestination = destinationCity(commonPair);
        System.out.println("Destination City is : " + returnDestination);
    }

    private static String destinationCity(List<List<String>> path) {
        List<String> outCityElement = new ArrayList<>();
        List<String> inCityElement = new ArrayList<>();

        for (int i = 0; i < path.size(); i++) {
            List<String> Element = path.get(i);
            String outElement = Element.get(0);
            String inElement = Element.get(1);
            outCityElement.add(outElement);
            inCityElement.add(inElement);
        }
        for (int j = 0; j < outCityElement.size(); j++) {
            //create local variable inElement
            String inElement = inCityElement.get(j);
            if (!outCityElement.contains(inElement))
                return inElement;
        }
        return null;
    }
}
