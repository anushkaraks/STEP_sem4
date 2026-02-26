import java.util.Scanner;

class PalindromeService {
    public boolean checkPalindrome(String input) {
        if (input == null) return false;
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i++) != input.charAt(j--)) return false;
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService(); // [cite: 69]

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        if (service.checkPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        scanner.close();
    }
}