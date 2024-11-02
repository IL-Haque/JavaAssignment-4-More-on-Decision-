import java.util.Scanner;

class Grade14 {
    private double numericGrade;

    public Grade14(double numericGrade) {
        this.numericGrade = numericGrade;
    }

    public String getLetterGrade() {
        if (numericGrade >= 4.0) {
            return "A";
        } else if (numericGrade >= 3.85) {
            return "A";
        } else if (numericGrade >= 3.5) {
            return "A-";
        } else if (numericGrade >= 3.15) {
            return "B+";
        } else if (numericGrade >= 2.85) {
            return "B";
        } else if (numericGrade >= 2.5) {
            return "B-";
        } else if (numericGrade >= 2.15) {
            return "C+";
        } else if (numericGrade >= 1.85) {
            return "C";
        } else if (numericGrade >= 1.5) {
            return "C-";
        } else if (numericGrade >= 1.15) {
            return "D+";
        } else if (numericGrade >= 0.85) {
            return "D";
        } else if (numericGrade >= 0.5) {
            return "D-";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric grade (0 to 4): ");
        double inputGrade = scanner.nextDouble();

        if (inputGrade < 0 || inputGrade > 4) {
            System.out.println("Invalid input. Please enter a number between 0 and 4.");
        } else {
            Grade14 grade = new Grade14(inputGrade);
            String letterGrade = grade.getLetterGrade();
            System.out.println("The closest letter grade is: " + letterGrade);
        }

        scanner.close();
    }
}
