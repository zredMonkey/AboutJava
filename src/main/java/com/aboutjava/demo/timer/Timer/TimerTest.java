package com.aboutjava.demo.timer.Timer;

import com.aboutjava.demo.utils.timestamp.TimeStampUtil;
import java.util.Timer;

/**
 * @Description:
 *
 *     Timer管理延时任务的缺陷
 *     Timer在执行定时任务时只会创建一个线程，所以如果存在多个任务，且任务时间过长，超过了两个任务的间隔时间，会发生一些缺陷
 *
 *     Timer当任务抛出异常时的缺陷
 *     其中有一个任务抛出了RuntimeException，那么所有的任务都会停止执行
 *
 *
 * @Date: 2020/9/2 19:08
 **/
public class TimerTest {
    public static void main(String[] args) {
        //  指定的流程很简单：
        //（1）第一步：创建一个Timer。
        //（2）第二步：创建一个TimerTask。
        //（3）第三步：使用Timer执行TimerTask。
        Timer timer = new Timer();
        MyTimerTask myTimerTask = new MyTimerTask("TimerTask 1");


        // 在10秒之后执行第一次，然后每隔3秒执行一次
//        timer.schedule(myTimerTask, 10000L, 3000L);

        // schedule(task,time) 在时间等于或超过time的时候执行且只执行一次task，这个time表示的是例如2019年11月11日上午11点11分11秒。指的是时刻。
//        Date date = new Date();
//        timer.schedule(myTimerTask, date);

        // 在delay时间之后，执行且只执行一次task。这个delay表示的是延迟时间，比如说三秒后执行
        timer.schedule(myTimerTask, 0L);

        // schedule(task,delay,period)
        // 在delay时间之后，开始首次执行task，之后每隔period毫秒重复执行一次task ，这个delay和上面的一样

        // scheduleAtFixedRate(task, time, period)
        // 在时间等于或超过time的时候首次执行task，之后每隔period毫秒重复执行一次task 这个time表示的是时刻

        // scheduleAtFixedRate(task, delay, period)
        // 在delay时间之后，开始首次执行task，之后每隔period毫秒重复执行一次task ，这个delay表示的是延迟时间，比如说三秒后执行

        // 取消此计时器任务
//        timer.cancel();

        // 返回此任务最近实际执行的安排执行时间
        long l = myTimerTask.scheduledExecutionTime();
        String s = TimeStampUtil.stampToDate(l);
        System.out.println("回此任务最近实际执行的安排执行时间 " + s);
    }
}
