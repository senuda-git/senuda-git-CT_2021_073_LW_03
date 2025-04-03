package Q_01_AND_Q_02;

public class Temperature {

    private double celsius;
    private double fahrenheit;

    //No-Arg Constructor for Temperature
    public Temperature() {
    }

    // Parameterized Constructor for Temperature
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    //getter method for toCelsius
    public double toCelsius() {
        return celsius;
    }

    //getter method for toFahrenheit
    public double toFahrenheit() {
        return fahrenheit;
    }

    //setter method for setFahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    //setter method for setCelsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public  double computeFahrenheit(){
        double fahrenheit = celsius * 9 / 5 + 32;
        return fahrenheit;
    }

    public  double computeCelsius(){
        double celsius = (toCelsius() - 32) * 5 / 9;
        return celsius;
    }

}
