package inheritanceEx;

public class MainAnimal {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();    // method from dog class
        dog.eat();    // method from Animal class
        Cat cat = new Cat();
        cat.bite();
        cat.catRun();
    }
}
