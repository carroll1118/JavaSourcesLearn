package com.carroll.test.inet;

import java.io.FileReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther Carroll
 * @Date 2020/4/20
 * @e-mail ggq_carroll@163.com
 */
public class TestInet {
    public static void main(String[] args) throws Exception {
        //InetAddress address = InetAddress.getLocalHost();
        Reader fr = new FileReader("read.txt");
        fr.read();
    }
}
