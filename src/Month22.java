import java.util.Scanner;

public class Month22 {
    private int month;

    public Month22(int month) {
        this.month = month;
    }

    public int getLength() {
        return (month == 2) ? 28 :
                (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int monthInput = scanner.nextInt();

        if (monthInput < 1 || monthInput > 12) {
            System.out.println("Invalid month. Please enter a number between 1 and 12.");
        } else {
            Month22 month = new Month22(monthInput);
            System.out.println(month.getLength() + " days");
        }

        scanner.close();
    }
}
