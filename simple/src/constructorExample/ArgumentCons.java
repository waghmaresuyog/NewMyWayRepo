package constructorExample;

public class ArgumentCons {
    private int numberOne; // non static variable or global variable
    private static int addiction; // static variable
    public ArgumentCons(int numberTwo, int numberThree) {
        numberOne = numberTwo + numberThree;
        System.out.println("Message from constructor sum of number is :" + numberOne);
    }
    public static void main(String[] args) {
        ArgumentCons argumentCons = new ArgumentCons(10, 20);
        addiction = argumentCons.numberOne + 20;
        System.out.println(" Message from Main method ,The sum of num is " + addiction);
    }
}
