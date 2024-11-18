
public class Circle1 {
    private double radius;
    private String color;
    public Circle1() {
        radius = 1.0;
        color = "red";
    }

    public Circle1(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    public double getArena() {
        return radius*radius*Math.PI;
    }
}
