import java.util.Scanner;

class Node {
    char data;
    Node next;
    Node(char data) { this.data = data; }
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) return;

        Node head = new Node(input.charAt(0));
        Node temp = head;
        for (int i = 1; i < input.length(); i++) {
            temp.next = new Node(input.charAt(i));
            temp = temp.next;
        }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        while (slow != null) {
            Node nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        Node left = head, right = prev;
        boolean isPalindrome = true;
        while (right != null) {
            if (left.data != right.data) {
                isPalindrome = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        System.out.println(input + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
        scanner.close();
    }
}