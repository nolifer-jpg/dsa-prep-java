import java.util.Scanner;
public class age_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age < 18 && age > 0){
            System.out.println("Minor");
        }
        else if (age >= 18){
            System.out.println("Adult");
        }
        else if (age <0){
            System.out.println(("Invalid age entered."));
        }
        sc.close();
    }
    
}
