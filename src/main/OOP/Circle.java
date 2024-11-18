public class Circle {
    private double radius;
    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getCircumference() {
        return radius*Math.PI;
    }

    public String toString() {
        return "Circle[radius = " + radius + ", area = " + radius*radius*Math.PI + ", circumference = " + radius*Math.PI + "]";
    }
}
