package com.carroll.test.network.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(8888);
        Socket accept = socket.accept();
    }
}
