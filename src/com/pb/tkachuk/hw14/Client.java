package com.pb.tkachuk.hw14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket s;
        try {
            Scanner cin = new Scanner(System.in);
            s = new Socket("localhost", 8881);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pn = new PrintWriter(s.getOutputStream(),true);
            System.out.println("Welcome to echo server...");
            System.out.println("To exit type 'bye'");
            System.out.println("---->");
            String get;
            do{
                get = cin.next();
                pn.println(get);
                System.out.println("Serer says " + br.readLine());
                System.out.println("---->");
            } while (get.compareTo("bye")!=0); {
                System.out.println("Bye...");
            };


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}