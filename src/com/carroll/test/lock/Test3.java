package com.carroll.test.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* 线程通信问题
* */
public class Test3 {
    public static void main(String[] args) {
        Data3 data = new Data3();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.printA();
            }
        },"A").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.printB();
            }
        },"B").start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                data.printC();
            }
        },"C").start();
    }
}


class Data3 {

    private int number = 1;
    Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    /*
     condition  可以精准的通知线程唤醒  也就是可以控制线程的执行顺序

    * condition.await();  // 等待
    * condition.signalAll();  //唤醒全部
    * */
    //+1


    public void printA(){
        lock.lock();
        try {
            while (number!=1){
                condition1.await();
            }

            System.out.println(Thread.currentThread().getName()+"+---->AAAAA");
            number = 2;
            condition2.signal();  //唤醒condition2
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.lock();
        }
    }
    public void printB(){
        lock.lock();
        try {
            while (number!=2){
                condition2.await();
            }

            System.out.println(Thread.currentThread().getName()+"+---->BBBBB");
            number = 3;
            condition3.signal();  //唤醒condition1
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.lock();
        }
    }
    public void printC(){
        lock.lock();
        try {
            while (number!=3){
                condition3.await();
            }

            System.out.println(Thread.currentThread().getName()+"+---->CCCCC");
            number = 1;
            condition1.signal();  //唤醒condition1
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.lock();
        }
    }
}
