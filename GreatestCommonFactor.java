import java.util.Scanner;
public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a , b ;
        System.out.println("This program find the greatest common factor");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A : ");
        a = scanner.nextInt();
        System.out.println("Enter B : ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("Two numbers have no greatest common factor");
        }
        else {
            while (a != b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            System.out.println("The Greatest Common Factor Is : " + a);
        }

    }
}
