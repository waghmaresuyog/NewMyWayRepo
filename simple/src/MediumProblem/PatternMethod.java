package MediumProblem;

public class PatternMethod {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int row) {

        int one, two, three, four;
        for (one = 1; one <= row; one++) {
            for (two = 1; two <= row - one; two++) {
                System.out.print(" ");
            }
            for (three = one; three != 0; three--) {
                System.out.print(three);
            }
            for (four = 2; four <= one; four++) {
                System.out.print(four);
            }
            System.out.println();
        }
    }
}
