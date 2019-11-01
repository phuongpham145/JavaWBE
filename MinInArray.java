import java.util.Scanner;
public class MinInArray {
    public static void main(String[] args) {
        int length, i, min;
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of this array : ");
        length = scanner.nextInt();
        System.out.println("Enter numbers in this array : ");
        for (i = 0; i < length; i++){
            System.out.print("A[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        min = a[0];
        for (i =0;i<length;i++){
            if (min>a[i]) min = a[i];
        }
        System.out.println("Min value in array is : " + min);
    }
}
