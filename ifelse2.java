// If else in java
import java.util.Scanner;
public class ifelse2 {
    public static void main(String[] args) {
        int marksObtained, passingMarks;

        passingMarks = 40;
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks scored by you");
        marksObtained = input.nextInt();
        if (marksObtained >= passingMarks) {
            System.out.println("you passed the exam.");
        }
        else {
            System.out.println("Unfortunately you failed to pass the exam.");
        }
    }
}
