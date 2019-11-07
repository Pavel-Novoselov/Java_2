package Lesson_5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule {
    public static void main(String[] args) {
//        ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);
//
//        exec.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(new Date() + " start");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(new Date() + " end");
//            }
//        }, 0, 1000L, TimeUnit.MILLISECONDS);


//        ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);
//
//        exec.scheduleWithFixedDelay(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("start");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("end");
//            }
//        }, 0, 1000L, TimeUnit.MILLISECONDS);


       Schedule schedule = new Schedule();
       schedule.testS();
    }


    void testS() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 22);
        calendar.set(Calendar.MINUTE, 18);
        calendar.set(Calendar.SECOND, 0);

        Date time = calendar.getTime();
        Timer timer = new Timer();
        timer.schedule(new RemindTask(), time);
    }

    class RemindTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("UP!");
        }
    }
}
