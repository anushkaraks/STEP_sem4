import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);
        System.out.println(input + (result ? " is a palindrome." : " is not a palindrome."));
        scanner.close();
    }

    public static boolean isPalindrome(String s, int start, int end) {

        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;

        return isPalindrome(s, start + 1, end - 1);
    }
}