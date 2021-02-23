package LAB8;

public class Rectangle extends Object2D{
    //attribute
    private double width;
    private double height;
    // constructor

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;


    }

    @Override
    public void calArea() {
        // Triangle area = FI *(width*height);
        double area = width*height;
        super.setArea(area);
    }
}