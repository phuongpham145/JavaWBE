import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        float originalAmount, rate, month, totalMoney, rateMoney, i;
        System.out.println("This program caculate your interest rate in bank ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your original amount :");
        originalAmount = scanner.nextFloat();
        System.out.println("Enter your rate :");
        rate = scanner.nextFloat();
        System.out.println("Enter your months :");
        month = scanner.nextFloat();
        rateMoney = 0;
        for (i = 1; i < month; i++) {
            rateMoney = originalAmount * (rate / 100) / 12 * month;
        }
        totalMoney = originalAmount + rateMoney;
        System.out.println("Your money and rate is : " + totalMoney);

    }
}
