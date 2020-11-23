package com.seecen.day01;

import java.util.Arrays;

/**
 * @program: javaOOP_Re
 * @Author: Jim Chan
 * @Description:
 * @create: 2020-11-23 15:13
 */
public class ArrayPrintTest {
    /*
    * (1,2,3,4,5)
    *  按格式打印出来
    *  [1,2,3,4,5]
    *
    * */
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3,4,5};
        System.out.print("[");
        /*System.out.print(arr[0]+",");
        System.out.print(arr[1]+",");
        System.out.print(arr[2]+",");
        System.out.print(arr[3]+",");
        System.out.print(arr[4]+"]");*/
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else {
                System.out.print(arr[i]+",");
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
