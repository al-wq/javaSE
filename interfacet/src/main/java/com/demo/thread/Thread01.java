package com.demo.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author ldz
 * @description: 通过继承Thread类来实现多线程
 */
public class Thread01 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"start");
        try {
            //休眠5秒钟
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
