import java.util.Scanner;
public class ChangeMoney {
    public static void main(String[] args) {
        float vnd , usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD :");
        usd = scanner.nextFloat();
        vnd = usd*23000;
        System.out.println("VND : " + vnd);

    }
}
