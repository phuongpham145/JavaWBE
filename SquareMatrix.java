import java.util.Scanner;
public class SquareMatrix {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int i, j, count = 0;
        System.out.println("Enter elements in array : ");
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < a[0].length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.println("A[" + i + "][" + j + "] = ");
                a[i][j] = scanner.nextInt();
            }
        }
        for (i = 0; i < a[0].length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("\n");
        }
        for (i = 0; i<a.length; i++)
            count += a[i][i];
        System.out.println("The total of diagonal line is : " + count);
    }
}
