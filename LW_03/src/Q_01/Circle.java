package Q_03;

public class Circle {

    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public  double computeArea(){
        double area = Math.PI * Math.pow(radius , 2);
        return area;
    }

    public  double computeCircumference(){
        double Circumference = 2 * Math.PI * radius;
        return Circumference;
    }

}
