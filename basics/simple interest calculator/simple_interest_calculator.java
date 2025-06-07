
import java.util.Scanner;

public class simple_interest_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int Principal = sc.nextInt();
        System.out.print("Enter Rate: ");
        int Rate = sc.nextInt();
        System.out.print("Enter Time: ");
        int Time = sc.nextInt();
        double result = ((double)Principal * Rate * Time) / 100;
        System.out.println("Simple Interest: " + result);
        sc.close();
    }
    
}
