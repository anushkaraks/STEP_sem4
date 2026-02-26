import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        // Normalize string: Remove non-alphanumeric and lowercase [cite: 52, 56]
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleanInput).reverse().toString();
        boolean isPalindrome = cleanInput.equals(reversed);

        System.out.println("Original: " + input);
        System.out.println("Normalized: " + cleanInput);
        System.out.println("Result: " + (isPalindrome ? "Palindrome" : "Not Palindrome"));
        scanner.close();
    }
}