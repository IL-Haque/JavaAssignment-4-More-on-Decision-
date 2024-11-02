import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Is the temperature in Celsius (C) or Fahrenheit (F)? ");
        char scale = scanner.next().toUpperCase().charAt(0);

        String state;

        if (scale == 'C') {
            if (temperature <= 0) {
                state = "solid (ice)";
            } else if (temperature >= 100) {
                state = "gaseous (steam)";
            } else {
                state = "liquid";
            }
        } else if (scale == 'F') {
            if (temperature <= 32) {
                state = "solid (ice)";
            } else if (temperature >= 212) {
                state = "gaseous (steam)";
            } else {
                state = "liquid";
            }
        } else {
            state = "invalid scale. Please enter 'C' for Celsius or 'F' for Fahrenheit.";
        }

        System.out.println("At " + temperature + "° " + scale + ", water is in a " + state + " state.");

        scanner.close();
    }
}
