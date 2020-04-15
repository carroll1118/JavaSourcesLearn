package com.carroll.test.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Auther Carroll
 * @Date 2020/4/8
 * @e-mail ggq_carroll@163.com
 */
public class TestArrayList {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        //List<Integer> list = new Vector<>();
        //List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(2);
    }
}
