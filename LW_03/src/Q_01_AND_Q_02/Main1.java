package Q_01_AND_Q_02;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        //Data member
        double celsiusTemperature;

        Scanner input = new Scanner(System.in);

        //Input for celsiusTemperature
        System.out.println("Enter Temperature in Celsius : ");
        celsiusTemperature = input.nextDouble();


        Temperature fromCelsius = new Temperature(celsiusTemperature);

        //compute fahrenheitValue
        double fahrenheitValue = fromCelsius.computeFahrenheit();

        //Output for fahrenheitValue
        System.out.println("Fahrenheit Temperature is " + String.format("%.2f", fahrenheitValue));

    }
}
