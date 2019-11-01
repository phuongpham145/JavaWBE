import java.util.Scanner;
public class charInString {
    public static void main(String[] args) {
        String str ;
        char index ;
        int i , count = 0 ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        str = scanner.nextLine();
        System.out.print("Enter a character : ");
        index = scanner.next().charAt(0);
        for (i = 0; i < str.length(); i++){
            if (str.charAt(i) == index){
                count ++;
            }
        }
        System.out.println("Chracter " + index + " appear " + count + " time ");
    }
}
