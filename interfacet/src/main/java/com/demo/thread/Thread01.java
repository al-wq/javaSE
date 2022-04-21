package com.demo.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author ldz
 * @description: 通过继承Thread类来实现多线程
 * 线程的主体类
 */
public class Thread01 extends Thread{
    /**
     * 成员属性
     */
    private String title;

    /**
     * 构造器方法，用来初始化成员属性
     * @param title
     */
    public Thread01(String title){
        this.title = title;
    }

    /**
     * 线程方法
     */
    @Override
    public void run(){
        for(int x=0;x<10;x++){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.title + "运行,X =" + x + "执行线程名称为：" + Thread.currentThread().getName());
        }
    }
}
