package com.seecen.day01;

/**
 * @program: javaOOP_Re
 * @Author: Jim Chan
 * @Description:
 * @create: 2020-11-23 16:06
 */
public class CatTest {
    public static void main(String[] args) {
        //获取Cat类的实例
        Cat cat = new Cat();
        /*cat.name = "小黄";
        cat.color = "橘色";
        cat.species = "中华田园猫";
        cat.age = -3;
        System.out.println("name:"+cat.name);
        System.out.println("color:"+cat.color);
        System.out.println("species:"+cat.species);
        System.out.println("age:"+cat.age);*/
        cat.setName("小黄");
        cat.setAge(-3);
        cat.setColor("橘色");
        cat.setSpecies("中华田园猫");
        System.out.println("name:"+cat.getName());
        System.out.println("color:"+cat.getColor());
        System.out.println("species:"+cat.getSpecies());
        System.out.println("age:"+cat.getAge());
        cat.catchMouse();
        cat.eat();
        cat.sleep(30);
        cat.showAge();
    }
}
