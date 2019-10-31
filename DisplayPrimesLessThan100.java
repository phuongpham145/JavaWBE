public class DisplayPrimesLessThan100 {
    public static void main(String[] args) {
        int i ,j ;
        boolean check = false ;
        System.out.print("2 ");
        for (i = 2; i <= 100; i++){
            for (j = 2; j < i; j++){
                if (i%j == 0) {
                    check = false;
                    break;
                } check = true ;
                }
            if (check) System.out.print( i + " ");
            }
        }
    }
