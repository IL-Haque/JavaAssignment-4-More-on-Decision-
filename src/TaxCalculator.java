import java.util.Scanner;

class TaxCalculator {
    private double income;
    private String taxpayerType;

    public TaxCalculator(double income, String taxpayerType) {
        this.income = income;
        this.taxpayerType = taxpayerType;
    }

    public double calculateTax() {
        double tax = 0.0;
        double taxFreeLimit = 0.0;

        if (taxpayerType.equalsIgnoreCase("male")) {
            taxFreeLimit = 350000;
        } else if (taxpayerType.equalsIgnoreCase("female") || taxpayerType.equalsIgnoreCase("senior")) {
            taxFreeLimit = 400000;
        } else {
            System.out.println("Invalid taxpayer type.");
            return -1; // Indicate an error
        }

        double taxableIncome = income - taxFreeLimit;
        if (taxableIncome <= 0) {
            return 0.0;
        }

        if (taxableIncome <= 100000) {
            tax = taxableIncome * 0.05;
        } else if (taxableIncome <= 400000) {
            tax = (100000 * 0.05) + (taxableIncome - 100000) * 0.10;
        } else if (taxableIncome <= 800000) {
            tax = (100000 * 0.05) + (300000 * 0.10) + (taxableIncome - 400000) * 0.15;
        } else if (taxableIncome <= 1300000) {
            tax = (100000 * 0.05) + (300000 * 0.10) + (400000 * 0.15) + (taxableIncome - 800000) * 0.20;
        } else {
            tax = (100000 * 0.05) + (300000 * 0.10) + (400000 * 0.15) + (500000 * 0.20) + (taxableIncome - 1300000) * 0.25;
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();

        System.out.print("Enter taxpayer type (male/female/senior): ");
        String taxpayerType = scanner.next();

        TaxCalculator calculator = new TaxCalculator(income, taxpayerType);
        double tax = calculator.calculateTax();

        if (tax != -1) {
            System.out.printf("The calculated tax is: BDT %.2f%n", tax);
        }

        scanner.close();
    }
}
