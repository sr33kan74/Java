// practicing java
import java.util.Scanner;
public class scanner10 {
    public static void main(String [] args) {
        System.out.println("Enter two numbers to add");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of two numbers is");
        System.out.println(sum);
    }
}