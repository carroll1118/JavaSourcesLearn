package com.carroll.test.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Auther Carroll
 * @Date 2020/4/15
 * @e-mail ggq_carroll@163.com
 */
public class testHashSet {
    public static void main(String[] args) {
        /*
        * HashSet底层是HashMap.
        * */
        //Set<Integer> set = new HashSet<>();
        //Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
        Set<Integer> set = new CopyOnWriteArraySet<>();
        set.add(8);
        set.remove(8);
        System.out.println(set);
    }
}
