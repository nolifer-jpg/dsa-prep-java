import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer to find its multiplication table: ");
        int n = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }
        sc.close();
    }
    
}
