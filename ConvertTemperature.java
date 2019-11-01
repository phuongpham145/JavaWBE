import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        byte chose ;
        System.out.println("Waht do you want ?");
        System.out.println("1. Change C Temperature to F Temperature");
        System.out.println("2. Change F Temperature to C Temperature");
        Scanner scanner = new Scanner(System.in);
        chose = scanner.nextByte();
        switch (chose){
            case 1 : Ctof();
                     break;
            case 2 : Ftoc();
                     break;
        }
    }

    public static void Ctof() {
        float doc, dof;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Celsius Temperature : ");
        doc = scanner.nextFloat();
        dof = (float) ((doc / (5.0 / 9)) + 32);
        System.out.println(doc + " celsius = " + dof + " fahrenheit");
    }

    public static void Ftoc() {
        float doc, dof;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fahrenheit Temperature : ");
        dof = scanner.nextFloat();
        doc = (float) ((5.0 / 9) * (dof - 32));
        System.out.println(dof + " fahrenheit = " + doc + " celsius");
    }
}
