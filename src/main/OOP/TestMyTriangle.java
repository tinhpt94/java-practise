
public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 3, 4);
        System.out.println(t1);
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Type: " + t1.getType());

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 0);
        MyPoint p3 = new MyPoint(3, 4);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println(t2);
        System.out.println("Perimeter: " + t2.getPerimeter());
        System.out.println("Type: " + t2.getType());

        MyTriangle t4 = new MyTriangle(0, 0, 2, 0, 1, 2);
        System.out.println(t4);
        System.out.println("Perimeter: " + t4.getPerimeter());
        System.out.println("Type: " + t4.getType());
    }
}
