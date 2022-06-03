package chapter7;

public class RectangleClass {
    private double length;
    private double width;

    public RectangleClass() {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length> 0.0 && length < 20.0) this.length = length;
        else{
            throw new IllegalArgumentException("length value is out of range");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0)this.width = width;
        else{
            throw new IllegalArgumentException("width value is out of range");
        }
    }

    public double perimeter(double length, double width) {
        return  2 * length + 2 * width;
    }

    public double area(double length, double width) {
        return length * width;
    }

}
