package MediumProblem;

public class PrimeNo {

    public void checkPrime(int number)
    {
        int temp = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                temp = temp + 1;
                break;
            }
        }
        if (temp == 0) {
            System.out.println(number + "  Number is Prime");
        } else {
            System.out.println(number + "  Number is not Prime");
        }
    }
    public static void main(String[] args) {
        PrimeNo primeNo = new PrimeNo();
        primeNo.checkPrime(8);
    }
}
