package simple;

public class EvenOdd {
    public void even_Odd_Number(int number) {
        //  int num = 15;
        if (number % 2 == 0) {
            System.out.println("The given Number is even");
        } else {
            System.out.println("The given is odd");
        }
    }
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.even_Odd_Number(15);
    }
}
