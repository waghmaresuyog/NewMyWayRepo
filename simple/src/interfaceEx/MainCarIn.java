package interfaceEx;

public class MainCarIn implements CarIn {
    @Override
    public void run() {
        System.out.println("car is runing form main car ");
    }
    public static void main(String[] args) {
        MainCarIn mainCarIn = new MainCarIn();
        mainCarIn.run();
        CarIn hero = new Hero();
        hero.run();
    }
}
