// java program to print reverse number
import java.util.Scanner;
class reverse {
    public static void main (String args[]) {
        int n, reverse = 0;

        System.out.println("Enter the number to reverse");
        Scanner in = new Scanner (System.in);
        n = in.nextInt();

        while ( n != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
        System.out.println("reverse of entered number is "+reverse);
    }
}
/* Step by step explanation of the code

        The code imports the Scanner class from the java.util package, which allows the program to read user input from the keyboard.
        The code defines a class named reverse, which contains the main method. The main method is where the program execution starts.
        The code declares two integer variables, n and reverse, and initializes reverse to 0. These variables will store the original number and the reversed number respectively.
        The code prints a message to prompt the user to enter a number to reverse.
        The code creates a Scanner object named in, which is connected to the standard input stream (System.in). This object can read user input as different data types, such as int, double, String, etc.
        The code uses the nextInt() method of the Scanner object to read an integer value from the user and assigns it to n.
        The code uses a while loop to reverse the digits of n. The loop condition is n != 0, which means that the loop will continue until n becomes 0.
        Inside the loop, the code performs three steps:
        It multiplies reverse by 10, which shifts the digits of reverse one place to the left. For example, if reverse is 123, then reverse * 10 is 1230.
        It adds n%10 to reverse, which appends the last digit of n to reverse. For example, if n is 456 and reverse is 1230, then reverse + n%10 is 1236. The % operator returns the remainder of dividing n by 10, which is the last digit of n.
        It divides n by 10, which removes the last digit of n. For example, if n is 456, then n/10 is 45. The / operator performs integer division, which discards any fractional part.
        After the loop ends, reverse contains the reversed number of n.
        The code prints a message to display the reversed number stored in reverse.
        I hope this explanation helps you understand the code better. If you have any questions or feedback, please let me know.
*/