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
        List<String> outCity = new ArrayList<>();
        List<String> inCity = new ArrayList<>();

        for (int i = 0; i < path.size(); i++) {
            List<String> Element = path.get(i);
            String outElement = Element.get(0);
            String inElement = Element.get(1);
            outCity.add(outElement);
            inCity.add(inElement);
        }
        for (int j = 0; j < outCity.size(); j++) {
            //create local variable inElement
            String inElement = inCity.get(j);
            if (!outCity.contains(inElement))
                return inElement;
        }
        return null;
    }
}