import java.util.Scanner;

class Card {
    private String notation;

    public Card(String notation) {
        this.notation = notation;
    }

    public String getDescription() {
        if (notation.length() < 2 || notation.length() > 3) {
            return "Unknown";
        }

        String valuePart = notation.substring(0, notation.length() - 1);
        char suitPart = notation.charAt(notation.length() - 1);

        String value;
        switch (valuePart) {
            case "A": value = "Ace"; break;
            case "J": value = "Jack"; break;
            case "Q": value = "Queen"; break;
            case "K": value = "King"; break;
            case "2": case "3": case "4": case "5": case "6":
            case "7": case "8": case "9": case "10":
                value = valuePart;
                break;
            default:
                return "Unknown";
        }

        String suit;
        switch (suitPart) {
            case 'D': suit = "Diamonds"; break;
            case 'H': suit = "Hearts"; break;
            case 'S': suit = "Spades"; break;
            case 'C': suit = "Clubs"; break;
            default:
                return "Unknown";
        }

        return value + " of " + suit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the card notation: ");
        String notation = scanner.nextLine().trim().toUpperCase();

        Card card = new Card(notation);
        System.out.println(card.getDescription());

        scanner.close();
    }
}
