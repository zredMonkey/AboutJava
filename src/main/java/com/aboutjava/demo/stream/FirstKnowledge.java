package com.aboutjava.demo.stream;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 初识Stream
 **/
public class FirstKnowledge {
    public static void main(String[] args) {

        String[] strings = {"a", "v", "c", "d"};

        List<String> words = Arrays.asList("a", "v", "c", "d");

        // parallelStream可以让流库以 并行方式 来执行过滤和计数
        long count = words.parallelStream().filter(w -> w.length() > 2).count();
        long count1 = words.stream().filter(w -> w.length() > 2).count();

        // 数组
        Stream<String> song = Stream.of("a", "b", "c", "d");

        // 可以用数组的一步恩元素来创建元素
        Stream<String> stream = Arrays.stream(strings, 1, 2);
        System.out.println(stream.collect(Collectors.toList()));

        // 如要生成0 1 2 3...这样的序列，则可以使用iterate方法
        // 它会接受一个“种子”值，以及一个函数，并且会反复将该函数应用到之前的结果上
        Stream<BigInteger> iterates = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
        System.out.println(iterates.collect(Collectors.toList()));

    }

}
