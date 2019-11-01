import java.util.Scanner;

public class UnitedArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];
        int i;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        for (i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "] = ");
            b[i] = scanner.nextInt();
        }
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
            for (i = a.length; i < c.length; i++) {
                c[i] = b[i - a.length];
            }
        for (i = 0; i < c.length; i++) {
            System.out.println(c[i] + "  ");
        }
    }
}
