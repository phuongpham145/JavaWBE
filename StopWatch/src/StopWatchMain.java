public class StopWatchMain {
    public static void main(String[] args) {
        long startTime , endTime ;
        int[] a = new int[10000];
        int i , j , temp ;
        StopWatch stopWatch = new StopWatch();
        startTime = stopWatch.getStartTime();
         for (i = 0 ; i < a.length ; i ++){
             a[i] = (int)(Math.random()*10001);
         }
         for (i = 0 ; i < a.length ; i++){
             System.out.print(a[i] + " ");
             if(i%32==0) System.out.println();
         }
         for (i = 0 ; i < a.length - 1; i++){
             for (j = i + 1; j < a.length; j++){
                 if (a[i] > a[j]){
                     temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                 }
             }
         }
        System.out.println();
         for (i = 0 ; i < a.length ; i++){
             System.out.print(a[i] + " ");
             if (i%32==0) System.out.println();
         }
        System.out.println();
         endTime = stopWatch.getEndTime();
        System.out.println(" Time is : " + (stopWatch.getElapsedTime(startTime,endTime)));
    }
}
