public class TestMyLine {
    public static void main(String[] args) {
        System.out.println("Testing Constructors:");
        MyLine line1 = new MyLine(1, 1, 4, 5);
        System.out.println("Line1 (using coordinates): " + line1);

        MyPoint begin = new MyPoint(2, 3);
        MyPoint end = new MyPoint(5, 7);
        MyLine line2 = new MyLine(begin, end);
        System.out.println("Line2 (using MyPoint objects): " + line2);

        System.out.println("Testing Getters and Setters:");
        System.out.println("Initial Line2: " + line2);

        line2.setBegin(new MyPoint(3, 3));
        System.out.println("Updated Line2 Begin Point: " + line2.getBegin());

        line2.setEnd(new MyPoint(6, 8));
        System.out.println("Updated Line2 End Point: " + line2.getEnd());

        System.out.println("Line2 after updates: " + line2);

        System.out.println("Testing Coordinate Getters and Setters:");
        line2.setBeginX(10);
        line2.setBeginY(10);
        line2.setEndX(20);
        line2.setEndY(20);

        System.out.println("Updated Begin X: " + line2.getBeginX());
        System.out.println("Updated Begin Y: " + line2.getBeginY());
        System.out.println("Updated End X: " + line2.getEndX());
        System.out.println("Updated End Y: " + line2.getEndY());

        System.out.println("Line2 after coordinate updates: " + line2);

        System.out.println("Testing Array-based Getters and Setters:");
        line2.setBeginXY(1, 1);
        System.out.println("Begin XY: (" + line2.getBeginXY()[0] + ", " + line2.getBeginXY()[1] + ")");
        line2.setEndXY(4, 5);
        System.out.println("End XY: (" + line2.getEndXY()[0] + ", " + line2.getEndXY()[1] + ")");
        System.out.println("Line2 after array updates: " + line2);

        System.out.println("Testing getLength and getGradient:");
        System.out.println("Line2 Length: " + line2.getLength());
        System.out.println("Line2 Gradient (in radians): " + line2.getGradient());

        System.out.println("Testing toString:");
        System.out.println("Line2 toString: " + line2);
    }
}
