import java.util.Scanner;

public class SwapElementsInArray {
    public static void main(String[] args) {
        int temp, i, length;
        int[] a = new int[100];
        System.out.print("Enter the length of this array :");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        System.out.println("\nEnter Array's Elements :");

        for (i = 0; i < length; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println("\nElements in array : ");
        for (i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nAfter swaped in this array :");
        for (i = 0; i < length / 2; i++) {
            temp = a[i];
            a[i] = a[length - 1 - i];
            a[length - 1 - i] = temp;
        }
        for (i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
