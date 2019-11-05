import java.util.Scanner;

public class QuadraticMain {
    public static void main(String[] args) {
        float a , b , c ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A = ");
        a = scanner.nextFloat();
        System.out.print("Enter B = ");
        b = scanner.nextFloat();
        System.out.print("Enter C = ");
        c = scanner.nextFloat();

        Quadratic quadratic = new Quadratic(a,b,c);
        if (quadratic.getDiscriminant() > 0){
            System.out.println("The equation has two roots : ");
            System.out.print("X1 = ");
            System.out.println(quadratic.getRoot1());
            System.out.print("X2 = ");
            System.out.println(quadratic.getRoot2());
        }else if (quadratic.getDiscriminant() == 0){
            System.out.println("The equation has one root : ");
            System.out.println("X = ");
            System.out.println(quadratic.getRoot1());
        }else
            System.out.println("The equation has no roots ");
    }
}
