package LAB8;

public  abstract class Object2D {
    // attributes
    private String b_coler;
    private double area;

    // abstract method
    abstract public   void calArea ();

    //getter and setter

    public String getB_coler() {
        return b_coler;
    }

    public void setB_coler(String b_coler) {
        this.b_coler = b_coler;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}