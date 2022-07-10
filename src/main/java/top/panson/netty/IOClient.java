package top.panson.netty;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @create 2022-07-09 00:33
 * @Author: Panson
 */
public class IOClient {

    public static void main(String[] args) {
        new Thread(() -> {

            try {
                Socket socket = new Socket("127.0.0.1", 8000);
                while(true) {
                    socket.getOutputStream().write((new Date() + ":hello world").getBytes());
                    Thread.sleep(2000);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
