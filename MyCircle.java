package Lab2;

/** Edited by Ahmed Jalambo */
public class MyCircle {

    private MyPoint center = new MyPoint(0, 0);
    private double radius = 1;

    public MyCircle() {
    }

    public MyCircle(double x, double y, double radius) {
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }

    public MyCircle(MyPoint p, double radius) {
        this.center = p;
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the center
     */
    public MyPoint getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public double getCenterX() {
        return this.center.getX();
    }

    public void setCenterX(double x) {
        this.center.setX(x);
    }

    public double getCenterY() {
        return this.center.getY();
    }

    public void setCenterY(double y) {
        this.center.setY(y);
    }

    public double[] getCenterXY() {
        double[] XY = new double[2];
        XY[0] = center.getX();
        XY[1] = center.getY();
        return XY;
    }

    public void setCenterXY(double x, double y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {

        return "MyCircle[ radius = " + getRadius() +
                ", center = (" + center.getX() + "," + center.getY() + ")]";
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * getRadius();
    }

    public double getDistance(MyCircle c) {
        return (Math.sqrt(
                Math.pow(c.getCenterX() - this.center.getX(), 2) + (Math.pow(c.getCenterY() - center.getY(), 2))));
    }

}
