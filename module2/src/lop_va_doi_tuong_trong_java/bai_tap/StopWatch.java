package lop_va_doi_tuong_trong_java.bai_tap;
import java.util.Scanner;
import java.time.LocalTime;
public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime(){
        return startTime;
    }
    public LocalTime getEndTime(){
        return endTime;
    }
    public void start(){
        this.startTime = java.time.LocalTime.now();
    }
    public void end(){
        this.endTime = java.time.LocalTime.now();
    }
    public int getElapsedTime(){
        int miliSecond = ((endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond()) * 1000);
        return miliSecond;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());

    }
}

