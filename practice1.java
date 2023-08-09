// practicing some programs
/*
import java.util.Scanner;
public class practice1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }
    }
}

 */


// practicing if else
/*
import java.util.Scanner;
public class practice1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}

 */

// practicing if else
/*
import java.util.Scanner;
public class practice1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
    }
}

 */


// practicing if else in java
/*
import java.util.Scanner;
public class practice1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor")
        }
    }
}

 */

// praticing if else in java
/*
import java.util.Scanner;
public class practice1 {
    public static void main (String [] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age > 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor please get out");
        }
    }
}

 */

// check the number is odd or even
/* import java.util.Scanner;
public class practice1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num % 2 < 1) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}

 */
// if else practice
/*
import java.util.Scanner;
public class practice1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Two numbers are the same");
        } else if (a > b) {
            System.out.println("First number is greater than the second");
        } else if (a < b) {
            System.out.println("First number is smaller than the second");
        }
    }
}


 */

// learning for loop
/*
import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sr.nextInt();
        System.out.println("Numbers from 1 to  "  + n + ":");
        for (int i = 1; i <= n; i ++) {
            System.out.print(i + " ");
        }
        sr.close();
    }
}


 */

// again some practice
import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Are you a vegetarian ?");
        System.out.println("Type yes or no");
        String x = sr.nextLine();

        if (x.equals("yes")) {
            System.out.println("You should try a Shawarma!");
        } else {
            System.out.println("Good job!");
		}
    }
}




