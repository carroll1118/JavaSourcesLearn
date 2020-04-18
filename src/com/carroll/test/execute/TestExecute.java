package com.carroll.test.execute;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Auther Carroll
 * @Date 2020/4/18
 * @e-mail ggq_carroll@163.com
 */
public class TestExecute {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,20,2,1,3);
    }
}
