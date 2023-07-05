package codingPractice;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double base = 6.0;
        double height = 4.0;
        Triangle triangle = new Triangle(base, height);
        double area = triangle.calculateArea();
        System.out.println("the area of Triangle is :" + area);
    }
}