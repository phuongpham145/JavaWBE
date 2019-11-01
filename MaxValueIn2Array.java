public class MaxValueIn2Array {
    public static void main(String[] args) {
        int[][] allValue = {
                {5, 983, 787, 714, 1375, 967, 1087},
                {983, 78, 214, 1102, 1763, 1723, 1842},
                {787, 214, -8, 888, 1549, 1548, 1627},
                {714, 1102, 888, 3456, 661, 781, 810},
                {1375, 1763, 1549, 661, -987, 1426, 1187},
                {967, 1723, 1548, 781, 1426, 2, 239},
                {1087, 1842, 1627, 810, 1187, 239, 0},
        };
        int i , j , max ;
        max = allValue[0][0];
        for (i = 0 ; i < allValue[0].length;i++) {
            for (j = 0; j < allValue.length; j++) {
                if (max < allValue[i][j])
                    max = allValue[i][j];
            }
        }
        System.out.println("Max Value in array is : " + max);
    }
}
