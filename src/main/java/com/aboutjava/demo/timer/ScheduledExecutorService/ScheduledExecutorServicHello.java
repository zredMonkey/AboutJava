package com.aboutjava.demo.timer.ScheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @Description:
 *
 *       ScheduledExecutorService在设计之初就是为了解决Timer&TimerTask的这些问题。因为天生就是基于多线程机制，所以任务之间不会相互影响（只要线程数足够。当线程数不足时，有些任务会复用同一个线程）
 *
 * @Date: 2020/9/2 19:40
 **/
public class ScheduledExecutorServicHello {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    }
}
