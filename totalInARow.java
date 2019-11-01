import java.util.Scanner;
public class totalInARow {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int i, j, count = 0 , row;
        System.out.println("Enter elements in array : ");
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < a[0].length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                a[i][j] = scanner.nextInt();
            }
        }
        for (i = 0; i < a[0].length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("Enter row you want calculate : ");
        row = scanner.nextInt();
        for (i = 0 ; i < a.length; i++){
            count += a[i][row];
        }
        System.out.println("Result is : " + count);
    }
}
