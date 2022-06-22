package com.wdd.studentmanager;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    @Test
    public void test(){
        //准备数据
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        //遍历删除,除去男生
        //使用迭代器的删除方法删除
        list.removeIf(integer -> integer.equals(3));
        System.out.println(list.size());
    }
}
