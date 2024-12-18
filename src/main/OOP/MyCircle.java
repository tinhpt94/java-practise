public class MyCircle {
    private MyPoint center;
    private int radius;
    public MyCircle(){
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setXY(x,y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]";
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getCircumference() {
        return 2*radius*Math.PI;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
}
