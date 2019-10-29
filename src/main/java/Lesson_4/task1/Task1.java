package main.java.Lesson_4.task1;

public class Task1 {
    public static void main(String[] args) {
        PrintLetter pl = new PrintLetter();
        Thread t1 = new Thread(()->{
            pl.printA();
        });
        Thread t2 = new Thread(()->{
            pl.printB();
        });
        Thread t3 = new Thread(()->{
            pl.printC();
        });

        t1.start();
        t2.start();
        t3.start();

    }
}

class PrintLetter{
    private final Object mon = new Object();
    private volatile char letter = 'A';

    public void printA(){
        synchronized (mon){
            for (int i = 0; i < 3; i++) {
                while (letter!='A'){
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("A");
                letter='B';
                mon.notifyAll();
            }
        }
    }

    public void printB(){
        synchronized (mon){
            for (int i = 0; i < 3; i++) {
                while (letter!='B'){
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                letter='C';
                mon.notifyAll();
            }
        }
    }

    public void printC(){
        synchronized (mon){
            for (int i = 0; i < 3; i++) {
                while (letter!='C'){
                    try {
                        mon.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("C");
                letter='A';
                mon.notifyAll();
            }
        }
    }

}


