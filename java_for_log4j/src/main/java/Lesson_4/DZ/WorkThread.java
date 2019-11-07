package Lesson_4.DZ;


public class WorkThread {
    static volatile char str = 'A';
    public static void main(String[] args) {
        Object lock = new Object();
        class MyTask implements Runnable {
            private char b;
            private char nextB;
            public MyTask(char b, char nextB) {
                this.b = b;
                this.nextB = nextB;
            }
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 5; i++) {
                        try {
                            while (str != b) {
                                lock.wait();
                            }
                            System.out.print(b);
                            str = nextB;
                            lock.notifyAll();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        new Thread(new MyTask('A', 'B')).start();
        new Thread(new MyTask('B', 'C')).start();
        new Thread(new MyTask('C', 'A')).start();
    }
}




class DZ {
    static Object mon = new Object();
    static volatile char currentLetter = 'A';

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (mon) {
                            while (currentLetter != 'A') {
                                mon.wait();
                            }
                            System.out.print("A");
                            currentLetter = 'B';
                            mon.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (mon) {
                            while (currentLetter != 'B') {
                                mon.wait();
                            }
                            System.out.print("B");
                            currentLetter = 'C';
                            mon.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (mon) {
                            while (currentLetter != 'C') {
                                mon.wait();
                            }
                            System.out.print("C");
                            currentLetter = 'A';
                            mon.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
