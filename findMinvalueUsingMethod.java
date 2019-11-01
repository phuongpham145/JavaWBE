import java.util.Scanner;

public class findMinvalueUsingMethod {
    public static void main(String[] args) {
        int[] a = new int[100];
        int length, i, min;
        System.out.print("Enter the array length : ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        System.out.println("\nEnter elements in array :");
        for (i = 0; i < length; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        min = findMin(a,length);
        System.out.print("\nMin Value in array is : " + min);
    }

    private static int findMin(int[] a,int length) {
        int i, min;
        min = a[0];
        for (i = 0; i < length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
