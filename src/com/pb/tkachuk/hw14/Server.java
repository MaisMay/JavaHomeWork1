package com.pb.tkachuk.hw14;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static ServerSocket socket;
    int k;

    public static void main(String[] args) {
        Server s2 = new Server();
        s2.serve();
    }
        void serve () {
            try {
                socket = new ServerSocket(8881);
                k = 0;
                while (true) {
                    Socket s;
                    s = socket.accept();
                    thread t = new thread(s);
                    t.start();
                    k++;
                }
            } catch
            (IOException e) {
                e.printStackTrace();
        }
    }
        class thread extends Thread {
        Socket s1;
        int i;

        public  thread(Socket s) {
            s1 = s;
            i=0;
        }
        public void run() {
            try { String get = String.valueOf('y');
                BufferedReader b1 = new BufferedReader(new InputStreamReader(s1.getInputStream()));
                PrintWriter pn = new PrintWriter(s1.getOutputStream(), true);
                while(true) {
                    get = b1.readLine();
                    if (get.equals("bye")) {
                        break;
                    }
                    if ( get!=null) {
                        pn.println(get);
                        i++;
                    }
                }
            k --;
                System.out.println("Client has write " +i+ "lines. And number of users were: " +k );
            } catch  (IOException e) {
                e.printStackTrace();
            }
        }
    }
}