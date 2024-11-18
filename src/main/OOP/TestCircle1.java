public class TestCircle1 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        System.out.println("The circle has a radius of " + c1.getRadius() + " and the area is " + c1.getArena());
        System.out.println("Color is " + c1.getColor());

        Circle1 c2 = new Circle1(2.0);
        System.out.println("The circle has a radius of " + c2.getRadius() + " and the area is " + c2.getArena());
        System.out.println("Color is " + c2.getColor());

        Circle1 c3 = new Circle1(3.0,  "blue");
        System.out.println("The circle has a radius of " + c3.getRadius() + " and the area is " + c3.getArena());
        System.out.println("Color is " + c3.getColor());

        Circle1 c4 = new Circle1();
        c4.setRadius(4.0);
        c4.setColor("green");
        System.out.println("The circle has a radius of " + c4.getRadius() + " and the area is " + c4.getArena());
        System.out.println("Color is " + c4.getColor());

        Circle1 c5 = new Circle1(5.5);
        System.out.println(c5.toString());
        System.out.println(c5);

    }
}
