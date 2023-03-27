package inheritanceEx;

public class MainAnimal {

    public static void main(String[] args) {
        Dog objDog = new Dog();
        objDog.run();    // method from dog class
        objDog.eat();    // method from Animal class

    }
}
