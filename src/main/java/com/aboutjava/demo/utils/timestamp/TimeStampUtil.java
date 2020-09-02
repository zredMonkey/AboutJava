package com.aboutjava.demo.utils.timestamp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 时间戳
 * @Date: 2020/9/2 19:29
 **/
public class TimeStampUtil {

    /**
     * @description: 将时间戳转换为时间
     * @date: 2020/8/27 9:21
     * @param: stamp 时间戳
     * @return: 时间
     **/
    public static String stampToDate(Long stamp) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(stamp);
        String sDate = simpleDateFormat.format(date);
        return sDate;
    }

    /**
     * @description: 将时间转换称时间戳
     * @date: 2020/8/27 21:26
     * @param: sdate 时间
     * @return: stamp 时间戳
     **/
    public static Long DateToString(String sdate) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(sdate);
        Long stamp = date.getTime();
        return stamp;
    }
}
