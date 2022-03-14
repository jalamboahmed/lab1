/** Edited by Ahmed Jalambo  */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create Scanner
        Scanner in = new Scanner(System.in);

        // promt user to enter x and y of the first point
        System.out.println("Enter the first point: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        MyPoint p1 = new MyPoint(x, y);

        // promt user to enter x and y of the second point
        System.out.println("Enter the second point: ");
        x = in.nextDouble();
        y = in.nextDouble();
        MyPoint p2 = new MyPoint(x, y);

        // display the informatons
        // System.out.println("Info.\n" +
        // p1 + "\n"
        // + p2);
        System.out.println("Info. \n" +
                "p1: " + Arrays.toString(p1.getXY()) +
                "\np2: " + Arrays.toString(p2.getXY()));

        // display the result
        System.out.println("Result.\n" +
                "\np1 is far of the origin " + p1.getDistance() +
                "\np2 is far of the origin " + p2.getDistance() +
                "\nThe distance between p1 and p2 " + p1.getDistance(p2) +
                "\nThe middle point between p1 and p2 " + p1.getMidMyPoint(p2));

        System.out.println("\n\nEnter the center and radius of first circle: ");
        x = in.nextDouble();
        y = in.nextDouble();
        double r = in.nextDouble();
        MyCircle c1 = new MyCircle(x, y, r);

        System.out.println("Enter the center and radius of second circle: ");
        x = in.nextDouble();
        y = in.nextDouble();
        r = in.nextDouble();
        MyCircle c2 = new MyCircle(x, y, r);

        System.out.println("Info.\n" +
                "c1 : " + Arrays.toString(c1.getCenterXY()) + ",radius " + c1.getRadius() +
                "\nc2: " + Arrays.toString(c2.getCenterXY()) + ",radius " + c2.getRadius());

        System.out.println("Result.\n" +
                "c1 center's is far fo the c2 center's " + c1.getDistance(c2) +
                "\nc1 area " + c1.getArea() +
                "\nc1 Circumference " + c1.getCircumference() +
                "\nc2 area " + c2.getArea() +
                "\nc2 Circumference " + c2.getCircumference());
        in.close();
    }

}
