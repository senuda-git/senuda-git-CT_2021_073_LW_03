package Q_03;

public class Circle {

    //Data member
    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //setter method for setRadius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //getter method for getRadius
    public double getRadius() {
        return radius;
    }

    //compute area and return
    public  double computeArea(){
        double area = Math.PI * Math.pow(radius , 2);
        return area;
    }

    //compute circumference and return
    public  double computeCircumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

}
