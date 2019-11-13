package Shape;

public class Circle extends Shape {
    @Override
    String color() {
        return null;
    }
     double radius = 1.0d ;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
