package com.cuizx.interview;

public class Interview03 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            AThread aThread = new AThread();
            BThread bThread = new BThread();
            CThread cThread = new CThread();
            aThread.start();
            aThread.join();
            bThread.start();
            bThread.join();
            cThread.start();
            cThread.join();
        }
    }
}
