package constructorExample;

public class MultipalCons {

	MultipalCons() {
		int a = 10;
		System.out.println("this is simple constructor");
	}

	MultipalCons(String name) {
		System.out.println("Message from sing argument cons, vaue of name is :" + name);
	}

	MultipalCons(int num, char c) {

		System.out.println("Message from sing argument cons, vaue of name is :" + c + num);
	}

	public static void main(String[] args) {

		MultipalCons ms1 = new MultipalCons();// create object of the constructors or default constroctor
		// System.out.println(ms1);
		MultipalCons ms2 = new MultipalCons("suyog");// passing argument or parameters
		MultipalCons ms3 = new MultipalCons(10, 's');// passing argument

	}

}
