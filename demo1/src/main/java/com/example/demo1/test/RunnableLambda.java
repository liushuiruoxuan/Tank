package com.example.demo1.test;

/**
 * @author hongxuan.chai
 */
public class RunnableLambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(name);
            }
        }).start();
    }
}
