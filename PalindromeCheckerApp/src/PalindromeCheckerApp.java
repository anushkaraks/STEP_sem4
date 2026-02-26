import java.util.*;

// Strategy Interface [cite: 86]
interface PalindromeStrategy {
    boolean isPalindrome(String s);
}

// Stack Strategy implementation [cite: 87]
class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        StringBuilder rev = new StringBuilder();
        while (!stack.isEmpty()) rev.append(stack.pop());
        return s.equalsIgnoreCase(rev.toString());
    }
}

// Two-Pointer Strategy implementation [cite: 87]
class TwoPointerStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void PallindromeCheckerApp(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        PalindromeStrategy strategy = new TwoPointerStrategy();

        System.out.println("Using Two-Pointer Strategy: " + strategy.isPalindrome(input));

        strategy = new StackStrategy();
        System.out.println("Using Stack Strategy: " + strategy.isPalindrome(input));
        scanner.close();
    }
}
