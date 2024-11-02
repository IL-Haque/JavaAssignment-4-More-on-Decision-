import java.util.Scanner;

public class Lexivographically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three strings: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String[] strings = {str1, str2, str3};

        java.util.Arrays.sort(strings);

        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}
