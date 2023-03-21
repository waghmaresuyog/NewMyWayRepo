package MediumProblem;

public class Pattern {
    public static void main(String[] args) {
        int row =4 ;
        // first loop print four row one by one
        for (int i=1; i<=row;i++)
        {   //this loop print space in each loop up to i value
            for (int j=1;j<=row-i;j++)
            {
                System.out.print(" ");// print blank space3
            }
            for (int k=i; k>=1;k--)
            {
                System.out.print(k);  //in first loop print 1
            }
            for (int l=2 ;l<=i;l++) //-
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
