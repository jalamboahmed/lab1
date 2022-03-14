package Lab2;

/** Edited by Ahmed Jalambo */
public class MyPoint {
    private double x = 0;
    private double y = 0;

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY() {
        double[] XY = new double[2];
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;
    }

    public double getDistance(MyPoint p) {

        return (Math.sqrt(Math.pow(this.x - p.getX(), 2) + (Math.pow(this.y - p.getY(), 2))));
    }

    public double getDistance(int x, int y) {
        return (Math.sqrt(Math.pow(this.x - x, 2) + (Math.pow(this.y - y, 2))));
    }

    public double getDistance() {
        return (Math.sqrt(Math.pow(this.x, 2) + (Math.pow(this.y, 2))));
    }

    public MyPoint getMidMyPoint(MyPoint p) {
        double x = ((this.x + p.getX()) / 2);
        double y = (this.y + p.getY()) / 2;
        return new MyPoint(x, y);
    }

    @Override
    public String toString() {
        return "MyPoint: ( " + this.x + " , " + this.y + " )";
    }
}
