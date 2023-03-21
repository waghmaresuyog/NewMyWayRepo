package abstractEx;

public class CarNew extends CarAbs {

    @Override
   public void run() {
        System.out.println("car is runing run from car new class ");
    }

    @Override
    public void eng() {
        System.out.println("eng is new , eng from car new ");
    }
}
