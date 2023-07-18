// checking odd and even number
import java.util.Scanner;
public class oddeven {
    public static void main(String args[]) {
        int x;
        System.out.println("Enter a integer to check if it is odd or even");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x % 2 == 0)
            System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");
    }
}
