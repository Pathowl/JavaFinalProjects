import java.util.Scanner;

//Projects done for fun :)

public class Main {

    public static void main(String[] args) {

        kelvinCalculator(43.3);
        fahrenheitCalculator(123.4);
        celsiusCalculator(24.1);

        getTemperature();


    }
    public static void getTemperature(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose Your temperature unit (will be calculated to another unit):
                (1) Celsius
                (2) Fahrenheit
                (3) Kelvin""");

        int i = scanner.nextInt();
        while (i > 3 || i < 1) {
            System.out.println("Wrong number, Try again: ");
            i = scanner.nextInt();
        }

        System.out.println("How many degrees?");

        double input = scanner.nextDouble();
        if  (i == 1) {
            System.out.println(Math.round(input + 273.15) + " K");
            System.out.println(Math.round((input * 1.8) +32) + " °F");
        } else if (i == 2) {

            System.out.println(Math.round((input - 32) * 0.5556) + " °C");

            double Kelvin = (input - 32) * 5;
            Kelvin = Kelvin / 9 + 273.15;
            System.out.println(Math.round(Kelvin) + " K");
        } else if (i == 3){
            System.out.println(Math.round(input - 273.15) + " °C");
            double Fahrenheit = (input - 273.15) * 9;
            Fahrenheit = Fahrenheit / 5 + 32;
            System.out.println(Math.round(Fahrenheit) + " °F");
        } else {
            System.out.println("Wrong input, try again: ");
        }
    }
    public static void kelvinCalculator(double temp) {
        System.out.println("-".repeat(20));
        double Celsius;
        double Fahrenheit;
        Celsius = temp - - 273.15;
        System.out.println(Celsius + " °C");
        Fahrenheit = (temp - 273.15) * 9;
        Fahrenheit = Fahrenheit / 5 + 32;
        System.out.println(Math.round(Fahrenheit) + " °F");
        System.out.println("-".repeat(20));

    }
    public static void fahrenheitCalculator(double temp) {
        System.out.println("-".repeat(20));
        System.out.println(Math.round((temp - 32) * 0.5556) + " °C");
        double Kelvin = (temp - 32) * 5;
        Kelvin = Kelvin / 9 + 273.15;
        System.out.println(Math.round(Kelvin) + " K");
        System.out.println("-".repeat(20));
    }
    public static void celsiusCalculator(double temp) {
        System.out.println("-".repeat(20));
        System.out.println(Math.round(temp + 273.15) + " K");
        System.out.println(Math.round((temp * 1.8) +32) + " °F");
        System.out.println("-".repeat(20));
    }
}