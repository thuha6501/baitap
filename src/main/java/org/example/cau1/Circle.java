package org.example.cau1;

public class Circle {
    private double radius=1.0;

    public Circle() {
    }

    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI *radius*radius;
    }
    public double getCircumference(){
        return Math.PI*radius*2;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
