package com.carroll.test.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test1 {
    public static void main(String[] args) throws Exception {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("66666666");
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始执行了......");
            }
        }).start();

        Thread.sleep(100);
        Thread.yield();
        //sleep 是当前线程进入休眠  不释放锁
        Thread.sleep(1000);


        //3个都是Object类的方法
        thread.wait();
        thread.notify();
        thread.notifyAll();

        StringBuilder sb =new StringBuilder();
        sb.append(1);

        Executors.newFixedThreadPool(10);
        Executors.newScheduledThreadPool(10);
        Executors.newCachedThreadPool();
        Executors.newWorkStealingPool();
        Executors.newSingleThreadExecutor();

    }
}
