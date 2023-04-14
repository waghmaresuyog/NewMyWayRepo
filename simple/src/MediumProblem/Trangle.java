package MediumProblem;

public class Trangle {

    public static void main(String[] args) {
        int number;
        int indexOne;
        int indexTwo;
        number = 4;

        for (indexOne = 0; indexOne <= number; indexOne++) {
            for (indexTwo = 0; indexTwo <= number - indexOne; indexTwo++) {
                System.out.print(" ");
            }
            for (indexTwo = 0; indexTwo <= indexOne; indexTwo++) {
                System.out.print(" " + add(indexOne, indexTwo));
            }
            System.out.println();
        }
    }

    public static int add(int indexOne, int indexTwo) {
        //24/2-1    24/1*24 1    //6/(3-2)=1*2-->    6/2=3===> return= 3    /// 24/(4-3)=1 *6--> 24/6= 4
        return factorial(indexOne) / (factorial(indexOne - indexTwo) * factorial(indexOne));
    }

    public static int factorial(int number) {
        int fact;
        for (fact = 1; number > 1; number--) {
            fact *= number;
        }
        return fact;
    }
}
