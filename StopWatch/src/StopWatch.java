public class StopWatch {
    private long startTime , endTime ;

    private long start(){
        endTime = System.currentTimeMillis();
        return endTime;
    }
    private long end(){
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getStartTime() {
        return start();
    }

    public long getEndTime() {
        return end();
    }
    public long getElapsedTime(long start , long end ){
        return end - start ;
    }
}
