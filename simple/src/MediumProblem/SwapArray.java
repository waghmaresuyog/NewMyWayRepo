package MediumProblem;

import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {
        int a[]={1,2,3,7};
        System.out.println(Arrays.toString(a));
        int temp = a[0];
        System.out.println(temp);
        a[0]=a[a.length-1];
        a[a.length-1] = temp;
        System.out.println(Arrays.toString(a));

        System.out.println(a[0]);
        checkPrime(a[0]);
}
    static void checkPrime(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }

}

