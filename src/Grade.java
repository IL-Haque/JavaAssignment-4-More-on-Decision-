import java.util.Scanner;

class Grade {
    private String letterGrade;

    public Grade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public double getNumericGrade() {
        char baseGrade = letterGrade.charAt(0);
        double numericValue;

        switch (baseGrade) {
            case 'A': numericValue = 4.0; break;
            case 'B': numericValue = 3.0; break;
            case 'C': numericValue = 2.0; break;
            case 'D': numericValue = 1.0; break;
            case 'F': numericValue = 0.0; break;
            default: return -1;
        }

        if (letterGrade.length() > 1 && baseGrade != 'F') {
            char modifier = letterGrade.charAt(1);
            if (modifier == '+') {
                numericValue += (baseGrade == 'A') ? 0.0 : 0.3;
            } else if (modifier == '-') {
                numericValue -= 0.3;
            }
        }

        return numericValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String inputGrade = scanner.nextLine().trim().toUpperCase();

        Grade grade = new Grade(inputGrade);
        double numericGrade = grade.getNumericGrade();

        if (numericGrade == -1) {
            System.out.println("Invalid grade entered.");
        } else {
            System.out.printf("The numeric value is %.1f.\n", numericGrade);
        }

        scanner.close();
    }
}
