import java.util.Scanner;

public class DisplayManyTriangle {
    public static void main(String[] args) {
        int chose;
        System.out.println("What do you want? \n 1.Print the rectangle\n" +
                "\n" +
                "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "\n" +
                "3.Print isosceles triangle\n" +
                "\n" +
                "4.Exit");
        Scanner scanner = new Scanner(System.in);
        chose = scanner.nextInt();
        switch (chose) {
            case 1:
                drawRectangle();
                break;
            case 2:
                drawSquareTriangle();
                break;
            case 3:
                drawIsoscelesTriangle();
                break;
            case 4:
                break;
        }
    }

    public static void drawRectangle() {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 7; j++)
                System.out.print("*");
            System.out.println("\n");
        }
    }

    public static void drawSquareTriangle() {
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < i; j++)
                System.out.print("*");
            System.out.println("\n");
        }
    }

    public static void drawIsoscelesTriangle() {
        int i, j;
        for (i = 7; i > 0; i--) {
            for (j = 0; j < i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
