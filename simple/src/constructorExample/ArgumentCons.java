package constructorExample;

public class ArgumentCons {

	 int a;			//non static variable or global variable 
	static int b;	//static variable 
	
	ArgumentCons(int num1, int num2)
	{
		a=num1+num2;
		System.out.println("Message from constructor sum of number is :"+a);
	}
	
	
	
	public static void main(String[] args) {
		
		ArgumentCons as = new ArgumentCons(10,20);
		b=as.a+20;
		System.out.println(" Message from Main method ,The sum of num is "+ b);

	}

}
