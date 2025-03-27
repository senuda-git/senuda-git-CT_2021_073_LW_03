package Q_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double innerCircleRadius;
        double outerCircleRadius;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Inner Circle Radius: ");
        innerCircleRadius = input.nextDouble();

        System.out.println("Enter Outer Circle Radius: ");
        outerCircleRadius = input.nextDouble();

        Circle innerCircle = new Circle(innerCircleRadius);
        Circle outerrCircle = new Circle(outerCircleRadius);


        double innerCircleArea = innerCircle.computeArea();
        double outerCircleArea = outerrCircle.computeArea();
        double shadedArea = outerCircleArea - innerCircleArea;

       // Circle innerCirle = new Circle();
        System.out.println("Shaded Circle Area is " +   String.format("%.2f", shadedArea));
        //Circle outerCirle = new Circle();
        //System.out.println("Outer Circle radius is " + outerCirle.getRadius());
    }
}
