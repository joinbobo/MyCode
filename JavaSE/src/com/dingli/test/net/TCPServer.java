package com.dingli.test.net;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception{
        // 新建服务端，在3305端口监听
        ServerSocket server = new ServerSocket(3305);

        while (true){
            System.out.println("服务端启动成功，等待客户端连接....");
            // accept方法是阻塞方法
            // 在接收到客户端连接之前，该方法之后的代码不会执行
            Socket client = server.accept();

            System.out.println("客户端"+ client.getRemoteSocketAddress() +"连接成功");

            Reader r = new InputStreamReader(client.getInputStream());
            BufferedReader reader = new BufferedReader(r);

            while (true){
                String str = reader.readLine();
                if("exit".equals(str)){
                    break;
                }
                System.out.println("客户端发来的消息：" + str);
            }

            reader.close();
        }


    }
}
