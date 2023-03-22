package MediumProblem;

public class PrimeNo {
    public static void main(String[] args) {

        int num =7;
        int temp =0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                temp=temp+1;
            }
        }
            if(temp==0)
            {
                System.out.println(num+"Number is Prime");
            }
            else
            {
                System.out.println(num+"Number is not Prime");
            }


    }
}
