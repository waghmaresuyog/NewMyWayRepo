package codingPractice;

public class AreaCalculator {
    public static void main(String[] args) {
        Cricle cricle = new Cricle("Red",5.0);
        cricle.display();
        System.out.println("The area of circle is :"+cricle.area());
        Rectangle rectangle = new Rectangle("Yellow",4.0,6.0);
        rectangle.display();
        System.out.println("The area of Rectangle is :" + rectangle.area());
    }
}
