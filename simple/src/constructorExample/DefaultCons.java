package constructorExample;

public class DefaultCons {

	static String name;	//Initialization
	
	public static void main(String[] args) {
	
		DefaultCons dc = new DefaultCons();
		System.out.println("the value of name is :"+ name);

	}

	
	DefaultCons()
	{
		name="suyog";	//declaration
		
		
	}
	
	
}
