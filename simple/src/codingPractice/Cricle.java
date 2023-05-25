package codingPractice;


abstract class Shape{
    protected String color;
    public Shape(String color)
    {
        this.color=color;
    }
    public abstract double area();
    public void display()
    {
        System.out.println("This is a " + color + " shape:");
    }

}
public class Cricle extends Shape{
    private double radius;
    public Cricle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {

        return Math.PI*radius*radius;
    }
}
