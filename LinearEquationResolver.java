import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        double a , b , c ;
        System.out.println("Linear Equation Resolve Program ");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a : ");
        a = scanner.nextDouble();

        System.out.println("Enter b : ");
        b = scanner.nextDouble();

        System.out.println("Enter c : ");
        c = scanner.nextDouble();

        if (a == 0){
            if (b == 0){
                if (c == 0)
                    System.out.println("This Equation Always True ");
            }
            else
                System.out.println("This Equation have no solutions");

        }
        else {
            double x = (c-b)/a;
            System.out.println("This Equation Have A Solution Is : " + x);
        }
    }
}
