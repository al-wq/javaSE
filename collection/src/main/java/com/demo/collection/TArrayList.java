package com.demo.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  ldz
 * @description 练习ArrayList
 */
public class TArrayList {
    List list = new ArrayList();
    /*
    分别向集合中放入整数和字符串，测试list的contains方法
     */
    @Test
    public void contains(){
        list.add(123);
        list.add("456");
        list.add(new String("789"));

        System.out.println(list.contains("123"));
        System.out.println(list.contains("456"));
        System.out.println(list.contains("789"));
    }
}
