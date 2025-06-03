package Model;
public class TriangleE extends FigureAbs {
    private double side;
    private double height;

    public TriangleE(double side, double height) {
        this.side = side;
        this.height = height;
    }

     public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return side*3;
    }

    @Override
    public double getPerimeter() {
        return (side*height)/2;
    }
}
