import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println(isPalindrome(s) ? "Palindrome possible" : "Palindrome not possible");
    }
    private static boolean isPalindrome(String s) {
        int[] arr = new int[26];
        int cnt = 0;
        for (int i = 0; i < s.length(); ++i) {
            ++arr[s.charAt(i) - 'a'];
        }

        for (int value : arr) {
            if (value % 2 != 0 && ++cnt == 2) {
                return false;
            }
        }
        return true;
    }
}
