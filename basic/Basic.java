import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the the string :");
        String userName = scan.nextLine();
        System.out.println("Hello " + userName + ", How are you ?");
    }
}
