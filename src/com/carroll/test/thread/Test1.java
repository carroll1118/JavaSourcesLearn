package com.carroll.test.thread;

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


        //3个都是Object类的方法
        thread.wait();
        thread.notify();
        thread.notifyAll();

    }
}
