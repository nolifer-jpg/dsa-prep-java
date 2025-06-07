import java.util.Scanner;


public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second number: ");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
