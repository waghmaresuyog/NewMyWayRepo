package constructorExample;

public class MultipalCons {
   public MultipalCons() {
        int number = 10;
        System.out.println("this is simple constructor  : " + number);
    }
   public MultipalCons(String name) {
        System.out.println("Message from sing argument cons, vaue of name is :" + name);
    }
   public MultipalCons(int num, char c) {
        System.out.println("Message from sing argument cons, vaue of name is :" + c +"  "+ num);
    }

    public static void main(String[] args) {
        MultipalCons multipalConsOne = new MultipalCons();// create object of the constructors or default constroctor
        // System.out.println(ms1);
        MultipalCons multipalConsTwo = new MultipalCons("suyog");// passing argument or parameters
        MultipalCons multipalConsThree = new MultipalCons(10, 's');// passing argument
    }
}
