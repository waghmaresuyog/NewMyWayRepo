package codingPractice;

public class RectangleValue {
    private int width;
    private int height;
    private int rectangleArea;

    public int getWidth()
    {
        return width;
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    public int getHeight()
    {
        return height;
    }
    public void setHeight(int height)
    {
        this.height=height;
    }

    public int getArea()
    {
        rectangleArea=width*height;
        return rectangleArea;
    }

}
