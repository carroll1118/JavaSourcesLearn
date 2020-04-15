package com.carroll.test.concurrentHashMap;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther Carroll
 * @Date 2020/4/10
 * @e-mail ggq_carroll@163.com
 */
public class test {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>(10);
        concurrentHashMap.put("carroll",20);

    }
}
