package MediumProblem;

public class PrimeNo {

    public void checkPrime(int number) {
        int flag = 0;
        int mid = number / 2;
        for (int counter = 2; counter <= mid; counter++) {
            if (number % counter == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1 || number == 0 || number == 1) {
            System.out.println("The given number is  : " + number + " is not prime ");
        } else {
            System.out.println("The given number is  : " + number + " And Number is prime");
        }
    }

    public static void main(String[] args) {
        PrimeNo primeNo = new PrimeNo();
        primeNo.checkPrime(9);
    }
}
