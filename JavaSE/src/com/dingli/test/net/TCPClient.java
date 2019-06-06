package com.dingli.test.net;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws Exception{
        // 客户端建立连接
        // 连接的
        // 127.0.0.1 IP和3305端口的服务端
        Socket client = new Socket("127.0.0.1",3305);

        // 用于向服务端发送消息
        Writer w = new OutputStreamWriter(client.getOutputStream());
        BufferedWriter writer = new BufferedWriter(w);

        // 接收客户端控制台输入
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        while (true){

            String str = reader.readLine();
            writer.write(str + "\n");
            writer.flush();

            if("exit".equals(str)){
                break;
            }

        }
        reader.close();
        writer.close();
    }
}
