package com.demo.thread.threadpool;

import java.util.concurrent.*;

/**
 * @author ldz
 * @description: 通过线程池方法实现多线程
 */
public class ThreadPool01 {
    //创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
    ExecutorService executorService01 = Executors.newCachedThreadPool();

    //创建一个指定工作线程数量的线程池。每当提交一个任务就创建一个工作线程，如果工作线程数量达到线程池初始的最大数，则将提交的任务存入到池队列中。
    ExecutorService executorService02 = Executors.newFixedThreadPool(10);

    //创建一个单线程化的Executor，即只创建唯一的工作者线程来执行任务，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
    // 如果这个线程异常结束，会有另一个取代它，保证顺序执行。单工作线程最大的特点是可保证顺序地执行各个任务，并且在任意给定的时间不会有多个线程是活动的。
    ExecutorService executorService03 = Executors.newSingleThreadExecutor();
    ThreadPoolExecutor executor = new ThreadPoolExecutor(10,30,100,
            TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(30) ,Executors.defaultThreadFactory(), new ThreadPoolExecutor.CallerRunsPolicy());

    public static void main(String[] args) {
        ThreadPool01 pool01 = new ThreadPool01();
        for (int i=0;i<1000;i++)
        pool01.test();
    }
    public void test(){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"started");

                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"end");
            }
        });
    }
}
