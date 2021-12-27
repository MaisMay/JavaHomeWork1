package com.pb.tkachuk.hw13;

import java.util.LinkedList;
import java.util.Queue;

public class multiThreading {


    public static void main(String[] args) throws InterruptedException {

        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}

class PC {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 2;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;

        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    lock.wait();
                    System.out.println("Компьютер произвел :" + value);
                }
                queue.add(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println("Коппьютер потребил : " + value);
                lock.notify();
            }

            Thread.sleep(1000);
        }
    }
}