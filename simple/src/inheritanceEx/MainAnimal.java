package inheritanceEx;

public class MainAnimal {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.run();    // method from dog class
        d.eat();    // method from Animal class

    }
}
