package arrayExample;

public class SimpleArray {

	public static void main(String[] args) {

		int ar[] = new int[4];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;

		for (int i = 0; i < ar.length; i++) {
			System.out.println("value of array is : " + ar[i]);
		}
		System.out.println("--------------------------------");
		// Other way to use array
		int a[] = { 50, 60, 70, 80, 90 };
		for (int j = 0; j < a.length; j++) {
			System.out.println("value of array is : " + a[j]);
		}

		// using for each loop

		String s[] = { "suyog", "prasad", "anushree", "deepak" };
		// printing array using for each loop
		for (String i : s) {
			System.out.println(i);
		}

	}

}
