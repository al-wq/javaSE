package com.demo.thread;

public class Thread01Demo {
    public static void main(String[] args) {
        /**
         * 启动三个线程
         */
        new Thread01("线程A").start();
        new Thread01("线程B").start();
        new Thread01("线程C").start();
    }
}
