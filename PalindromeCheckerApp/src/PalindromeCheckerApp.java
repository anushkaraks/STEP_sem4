import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void PalindromeCheckerApp(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long string for performance test: ");
        String input = scanner.nextLine();

        // Test String Reverse [cite: 105]
        long start = System.nanoTime(); [cite: 109]
        isPalindromeReverse(input);
        long end = System.nanoTime();
        System.out.println("String Reverse Time: " + (end - start) + " ns"); [cite: 107]

        // Test Two-Pointer
        start = System.nanoTime();
        isPalindromeTwoPointer(input);
        end = System.nanoTime();
        System.out.println("Two-Pointer Time: " + (end - start) + " ns");

        scanner.close();
    }

    public static boolean isPalindromeReverse(String s) {
        return new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
    }

    public static boolean isPalindromeTwoPointer(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}