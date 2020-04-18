package com.carroll.test.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther Carroll
 * @Date 2020/4/8
 * @e-mail ggq_carroll@163.com
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        //Map<String,Integer> map = Collections.synchronizedMap(new HashMap<>());
        //Map<String,Integer> map = new ConcurrentHashMap<>();
        map.put("carroll",20);
        System.out.println(map);
    }
}
