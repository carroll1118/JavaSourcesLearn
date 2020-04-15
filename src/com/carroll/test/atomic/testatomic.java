package com.carroll.test.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther Carroll
 * @Date 2020/4/15
 * @e-mail ggq_carroll@163.com
 */
public class testatomic {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.getAndIncrement();
        atomicInteger.getAndDecrement();
    }
}
