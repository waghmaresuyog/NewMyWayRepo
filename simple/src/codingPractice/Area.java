package codingPractice;

public class Area {
    public static void main(String[] args) {
        RectangleValue rectangleValue = new RectangleValue();
        rectangleValue.setWidth(10);
        rectangleValue.setHeight(20);
        System.out.println("The width is  : "+rectangleValue.getWidth()+ " and The Height is  : " + rectangleValue.getHeight());
        System.out.println("the area of rectangle is : "+rectangleValue.getArea());
    }
}
