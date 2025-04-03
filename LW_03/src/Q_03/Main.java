package Q_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Data member
        double innerCircleRadius;
        double outerCircleRadius;

        Scanner input = new Scanner(System.in);

        //Input for innerCircleRadius
        System.out.println("Enter Inner Circle Radius: ");
        innerCircleRadius = input.nextDouble();

        //Input for outerCircleRadius
        System.out.println("Enter Outer Circle Radius: ");
        outerCircleRadius = input.nextDouble();

        Circle innerCircle = new Circle(innerCircleRadius);
        Circle outerrCircle = new Circle(outerCircleRadius);

        //compute shadedArea
        double innerCircleArea = innerCircle.computeArea();
        double outerCircleArea = outerrCircle.computeArea();
        double shadedArea = outerCircleArea - innerCircleArea;

        //compute shadedCircumference
        double innerCircleCircumference = innerCircle.computeCircumference();
        double outerCircleCircumference = outerrCircle.computeCircumference();
        double shadedCircumference = outerCircleCircumference - innerCircleCircumference;

        //Output for shadedArea and shadedCircumference
        System.out.println("Shaded Circle Area is " + String.format("%.2f", shadedArea));
        System.out.println("Shaded Circle Circumference is " + String.format("%.2f", shadedCircumference));

    }
}
