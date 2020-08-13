package com.carroll.test.thread;

import java.util.concurrent.locks.ReentrantLock;

public class TestAQS {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(false);

        lock.lock();



        lock.unlock();
    }
}
