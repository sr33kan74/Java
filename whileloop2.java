// while loop using break program in java
import java.util.Scanner;
public class whileloop2 {
    public static void main (String args[]) {
        int n;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Input a integer");
            n = input.nextInt();
            if (n==0)
            {
                break;
            }
            System.out.println("You entered " + n);
        }
    }
}
