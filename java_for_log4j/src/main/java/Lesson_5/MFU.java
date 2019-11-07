package Lesson_5;

public class MFU {

    Object printLock = new Object();
    Object scanLock = new Object();

    public void print(String doc, int n) {

        synchronized (printLock) {
            System.out.println("Начало печати");
            for (int i = 0; i < n; i++) {
                System.out.println("Печать " + i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Конец печати");
        }

    }


    /**
     * @param doc = sdsfsdf
     * @param n
     */
    public void scan(String doc, int n) {

        synchronized (scanLock) {
            System.out.println("Начало сканирования");
            for (int i = 0; i < n; i++) {
                System.out.println("Сканируем " + i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Конец сканирования");
        }

    }

    public static void main(String[] args) {

        MFU mfu = new MFU();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan("Doc1", 5);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan("Doc2", 6);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.print("Doc3", 7);
            }
        }).start();

    }

}
