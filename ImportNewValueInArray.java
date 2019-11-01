import java.util.Scanner;

public class ImportNewValueInArray {
    public static void main(String[] args) {
        int[] a = new int[100];
        int length, i, newValue, position;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of this array : ");
        length = scanner.nextInt();
        System.out.println("Enter the elements in array : ");
        for (i = 0; i < length; i++) {
            System.out.print("A[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println("This array is : ");
        for (i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }
        do {
            System.out.print("\nEnter the position is needed change : ");
            position = scanner.nextInt();
        } while (position < 0);

        System.out.print("\nEnter the value of new position : ");
        newValue = scanner.nextInt();
        importValue(a, length, position, newValue);
    }

    public static void importValue(int[] a, int length, int position, int newValue) {
        int i;
        for (i = length; i > position; i--) {
            a[i] = a[i - 1];
        }
        a[position] = newValue;
        System.out.println("New array after import new value is : ");
        for (i = 0; i <= length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
