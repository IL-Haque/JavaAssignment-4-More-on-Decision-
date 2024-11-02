import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a single character from the alphabet: ");
        String input = scanner.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: Please enter exactly one character.");
            scanner.close();
            return;
        }

        char ch = input.charAt(0);

        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error: Please enter a valid letter (a-z or A-Z).");
        }

        scanner.close();
    }
}
