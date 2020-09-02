package com.aboutjava.demo.timer.Timer;

import java.util.TimerTask;

/**
 * @Description: 定时器
 * @Date: 2020/9/2 19:03
 **/
public class MyTimerTask extends TimerTask {

    private String taskName;

    public MyTimerTask(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName =taskName;
    }

    @Override
    public void run() {
        System.out.println("当前执行的任务是==========" + taskName);
    }
}
