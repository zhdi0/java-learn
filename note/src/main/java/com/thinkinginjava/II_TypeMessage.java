package com.thinkinginjava;

import java.util.ArrayList;
import java.util.List;

public class II_TypeMessage {
}





class AA{}

class SubAA extends AA{}

class TTTT {
    public static void main(String[] args) {

        AA aa = new AA();
        AA subAA = new SubAA();

        // 实例 instanceof 具体类型
        if (subAA instanceof AA){
            System.out.println("1111111");
        }

        AA aa1 = new AA();
        List<AA> list1 = new ArrayList<>();
        AA subAA1 = new SubAA();
        list1.add(subAA1);
        Class clazz = list1.get(0).getClass();

        //// 编译报错
        //if (subAA instanceof clazz){
        //    System.out.println("1111111");
        //}

        // 不知道具体类型  clazz.isInstance(实例)
        if (clazz.isInstance(subAA)){
            System.out.println("1111111");
        }

    }
}














class CountedInteger {
    public static long counter;
    public final long id = counter++;   //只赋值一次，即使counter改变也不会再次赋值

    public long getId() {
        return id;
    }

    public String toString() { return Long.toString(id); }
}

class FilledList1<T> {

    public static void main(String[] args) {
        CountedInteger ci = new CountedInteger();
        CountedInteger.counter = 1;
        System.out.println(ci.getId());
        CountedInteger.counter = 2;
        System.out.println(ci.getId());
    }
}










