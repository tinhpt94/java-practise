public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(3, 4, 5);
        MyPoint center = new MyPoint(6, 8);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println();

        System.out.println("Radius of c2: " + c2.getRadius());
        c2.setRadius(7);
        System.out.println("New radius of c2: " + c2.getRadius());

        System.out.println("Coordinate center of c2: (" + c2.getCenterX() + ", " + c2.getCenterY() + ")");

        c1.setCenter(new MyPoint(1, 1));
        System.out.println("New center of c1: " + c1);
        System.out.println();

        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Circumference of c1: " + c1.getCircumference());

        System.out.println("Area of c2: " + c2.getArea());
        System.out.println("Circumference of c2: " + c2.getCircumference());

        System.out.println("Distance between centers c1 và c2: " + c1.distance(c2));
    }
}
