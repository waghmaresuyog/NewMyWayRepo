package constructorExample;

public class MultipalCons {
    private int number = 10;
    public MultipalCons() {
        System.out.println("this is simple constructor  : " + number);
    }
    public MultipalCons(String name) {
        System.out.println("Message from sing argument cons, vaue of name is :" + name);
    }
    public MultipalCons(int number, char symbol) {
        System.out.println("Message from sing argument cons, vaue of name is :" + symbol + "  " + number);
    }
    public static void main(String[] args) {
        new MultipalCons();
        MultipalCons multipalConsTwo = new MultipalCons("suyog");// passing argument or parameters
        MultipalCons multipalConsThree = new MultipalCons(30, 's');// passing argument
    }
}