import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionClass {
    public static void main(String[] args) {
        int n, i, position;
        int[] b = new int[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length og array : ");
        n = scanner.nextInt();
        createArray(n);
        int[] b = int a ;
        System.out.println("Enter the position :");
        position = scanner.nextInt();
        findNum(position,int[] a);
    }

    public int[] createArray(int n) {
        int i;
        int[] a = new int[n];
        for (i = 0; i < a.length; i++) {
            a[i] = a[i] = (int) (Math.random() * 1001);
        }
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        return a ;
    }
    public static void findNum ( int position, int[] b ){
        System.out.println("This element is : " + b[position]);
    }
}
