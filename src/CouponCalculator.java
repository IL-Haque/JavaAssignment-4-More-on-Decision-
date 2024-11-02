import java.util.Scanner;

public class CouponCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the cost of your groceries: ");
        double amountSpent = scanner.nextDouble();

        double couponValue = 0.0;
        String couponDescription = "";

        if (amountSpent < 10) {
            couponDescription = "No coupon";
        } else if (amountSpent >= 10 && amountSpent <= 60) {
            couponValue = amountSpent * 0.08;
            couponDescription = "8% of your purchase";
        } else if (amountSpent > 60 && amountSpent <= 150) {
            couponValue = amountSpent * 0.10;
            couponDescription = "10% of your purchase";
        } else if (amountSpent > 150 && amountSpent <= 210) {
            couponValue = amountSpent * 0.12;
            couponDescription = "12% of your purchase";
        } else if (amountSpent > 210) {
            couponValue = amountSpent * 0.14;
            couponDescription = "14% of your purchase";
        }

        if (amountSpent < 10) {
            System.out.println("You win a discount coupon: " + couponDescription + ".");
        } else {
            System.out.printf("You win a discount coupon of $ %.2f. (%s)\n", couponValue, couponDescription);
        }

        scanner.close();
    }
}
