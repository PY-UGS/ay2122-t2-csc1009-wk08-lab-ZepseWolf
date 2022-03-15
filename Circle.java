package week8;

public class Circle {
    private double radius;
    private static double PI = 3.14159;


    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return PI*this.radius*this.radius;
    }

    public double getDiameter(){
        return  PI*2*this.radius;
    }
}
