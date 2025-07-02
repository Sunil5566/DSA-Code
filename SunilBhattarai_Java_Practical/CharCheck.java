import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if (Character.isLetter(ch))
            System.out.println("Alphabet");
        else
            System.out.println("Special Character");
    }
}
