package arrayExample;

public class SimpleArray {

	public static void main(String[] args) {
		
		int ar[] = new int [4];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		
		for (int i=0;i<ar.length;i++)
		{
			System.out.println("value of array is : "+ ar[i]);
		}

	}

}
