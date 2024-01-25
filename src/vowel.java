import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char letter = sc.next().charAt(0);

        // Convert the letter to lowercase for case-insensitive comparison
        letter = Character.toLowerCase(letter);

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " is a vowel.");
                break;
            default:
                System.out.println(letter + " is a consonant.");
        }
    }
}


