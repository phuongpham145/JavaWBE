import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        float[] marks = new float[100];
        int i, count = 0, length;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the number of students less than 30 : ");
            length = scanner.nextInt();
        } while (length < 1 || length > 30);
        System.out.println("Enter marks : ");
        for (i =0; i<length; i++){
            System.out.println("Student " + i + " : " );
            marks[i] = scanner.nextFloat();
        }
        for (i=0;i<length;i++){
            if (marks[i] < 5)
                count ++;
        }
        System.out.println("The numner of sutdents isn't passed : " + count);
    }
}
