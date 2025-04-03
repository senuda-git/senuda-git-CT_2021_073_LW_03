package Q_01_AND_Q_02;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //Data member
        double fahrenheitTemperature;

        Scanner input = new Scanner(System.in);

        //Input for fahrenheitTemperature
        System.out.println("Enter Temperature in Fahrenheit : ");
        fahrenheitTemperature = input.nextDouble();


        Temperature fromFahrenheit = new Temperature(fahrenheitTemperature);

        //compute fahrenheitValue
        double celsiusValue = fromFahrenheit.computeCelsius();

        //Output for fahrenheitValue
        System.out.println("Celsius Temperature is " + String.format("%.2f", celsiusValue));

    }
}

