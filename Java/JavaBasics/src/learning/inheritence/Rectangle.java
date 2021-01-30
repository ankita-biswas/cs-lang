package learning.inheritence;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public double getHeight() {
	return height;
    }

    public void setHeight(double height) {
	this.height = height;
    }

    public double getWidth() {
	return width;
    }

    public void setWidth(double width) {
	this.width = width;
    }

    public double area() {
	double area = height * width;
	return area;
    }
}
