import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] a = new int[100];
        int length, i, c, value;
        System.out.println("Enter value of array : ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        System.out.println("Enter elements of this array :");
        for (i = 0; i < length; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter the value need deleted : ");
        value = scanner.nextInt();
        for (c = i = 0; i < length; i++) {
           if (a[i] != value){
               a[c] = a[i];
               c++;
           }
        }
        length = c;
        for (i = 0; i < length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
