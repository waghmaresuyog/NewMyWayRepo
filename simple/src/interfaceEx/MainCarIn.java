package interfaceEx;

public class MainCarIn implements CarIn {
    @Override
    public void run() {
        System.out.println("car is runing form main car ");
    }
    public static void main(String[] args) {
        MainCarIn objMain = new MainCarIn();
        objMain.run();
        CarIn objHero = new Hero();
        objHero.run();
    }
}
