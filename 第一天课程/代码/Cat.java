package com.seecen.day01;

/**
 * @program: javaOOP_Re
 * @Author: Jim Chan
 * @Description:
 * @create: 2020-11-23 16:01
 */
public class Cat {
    //1.将属性私有化
    //2.留出属性对外的访问接口
    //3.在对应的方法里添加控制语句
    private String name;
    private String color;
    private String species;
    private int age;

    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
    public void eat(){
        System.out.println("猫吃小鱼干！");
    }
    public void sleep(int time){
        System.out.println("小猫睡了"+time+"分钟！");
    }
    public void showAge(){
        System.out.println("我是一只"+age+"月大的小猫！");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        if (age<=0){
            this.age = 1;
            System.err.println("您输入的年龄有误，已设置为默认年龄1岁！");
        }else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
