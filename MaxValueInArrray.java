import java.util.Scanner;

public class MaxValueInArrray {
    public static void main(String[] args) {
        int length, i, max;
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of this array : ");
        length = scanner.nextInt();
        System.out.println("Enter numbers in this array : ");
        for (i = 0; i < length; i++){
            System.out.print("A[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        max = a[0];
        for (i =0;i<length;i++){
            if (max<a[i]) max = a[i];
        }
        System.out.println("Max value in array is : " + max);
    }
}
