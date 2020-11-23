package com.seecen.day01;

/**
 * @program: javaOOP_Re
 * @Author: Jim Chan
 * @Description:
 * @create: 2020-11-23 14:58
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("面向过程：");
        //1.打开冰箱
        System.out.println("打开冰箱！");
        //2.将大象放进冰箱
        System.out.println("将大象放进冰箱！");
        //3.关闭冰箱
        System.out.println("关闭冰箱！");
        System.out.println("面向对象：");
        //获取Elephant类型的对象
        Elephant elephant = new Elephant();
        //获取Fridge类型的对象
        Fridge fridge = new Fridge();
        fridge.open();
        elephant.in();
        fridge.close();
    }
}
