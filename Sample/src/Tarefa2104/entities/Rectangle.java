package Tarefa2104.entities;

public class Rectangle {

    private double width, height;


    public void setWidth(double w) {
        width = w;
    }


    public void setHeight(double h) {
        height = h;
    }


    public double area() {
        return width * height;
    }


    public double perimeter() {
        return 2 * (height + width);
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public String toString() {
        return String.format("Width = %.2f, Height = %.2f", width, height);
    }
}

