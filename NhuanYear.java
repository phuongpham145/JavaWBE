import java.util.Scanner;
public class NhuanYear {
    public static void main(String[] args) {
        int year ;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if ((year%4 == 0 && year%100 != 100) || (year%100 == 0 && year%400 == 0))
            System.out.println("Nam nhuan");
        else
            System.out.println("Khong phai nam nhuan");
    }
}
