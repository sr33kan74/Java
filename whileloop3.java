// while loop using break and continue program in java
import java.util.Scanner;
public class whileloop3 {
    public static void main(String args[]) {
        int  n;
        Scanner input = new Scanner (System.in);

        while(true) {
            System.out.println("Input an integer");
            n = input.nextInt();

            if (n != 0) {
                System.out.println("Yo entered " + n);
                continue;
            }
            else {
                break;
            }
        }
    }
}