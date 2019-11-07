package Lesson_5;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ConcurrentList {
    public static void main(String[] args) throws InterruptedException {
//        ArrayBlockingQueue<String> abl = new ArrayBlockingQueue<String>(10);
//
//        abl.add("asd");
//        boolean flag = abl.offer("asd");

//        ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
//
//
//        Map<String, String> hm = Collections.synchronizedMap(new HashMap<>());


//        Semaphore semaphore = new Semaphore(4);
//        ExecutorService serv = Executors.newFixedThreadPool(10);
//
//        for (int i = 0; i < 10; i++) {
//            serv.execute(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(1);
//
//                    try {
//                        semaphore.acquire();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    try {
//                        Thread.sleep(2000);
//                        semaphore.release();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(2);
//                }
//            });
//        }
//
//        serv.shutdown();



//        CountDownLatch cdl = new CountDownLatch(10);
//
//        for (int i = 0; i < 10; i++) {
//            int w = i;
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(w + " -1");
//                    try {
//                        Thread.sleep((int) Math.random() * 100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(w + " -2");
//                    cdl.countDown();
//                }
//            }).start();
//        }
//
//        cdl.await();
//        System.out.println("END");


//        CyclicBarrier cb = new CyclicBarrier(10);
//
//        for (int i = 0; i < 10; i++) {
//            int w = i;
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(w + " -1");
//                    try {
//                        Thread.sleep((int) Math.random() * 100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(w + " -2");
//                    try {
//                        cb.await();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } catch (BrokenBarrierException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
//        }
//
//        System.out.println("END");


//        ReentrantReadWriteLock r1 = new ReentrantReadWriteLock();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                r1.writeLock().lock();
//                System.out.println(1);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(2);
//                r1.writeLock().unlock();
//            }
//        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                r1.lock();
//                System.out.println(3);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(4);
//                r1.unlock();
//            }
//        }).start();


        AtomicInteger ai = new AtomicInteger(100);

        ai.decrementAndGet();

        System.out.println(ai);
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(ai.incrementAndGet());
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(ai.incrementAndGet());
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(ai.incrementAndGet());
//            }
//        }).start();





    }
}
