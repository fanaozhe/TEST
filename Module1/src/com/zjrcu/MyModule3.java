package com.zjrcu;

import java.util.ArrayList;

/**
 * @author fanaz
 * @create 2020-06-11-8:41
 */
public class MyModule3 {
    public static void main(String[] args) {
        String[] arr = new String[]{"fanaozhe", "zhuyandi", "xaiobao"};
        //fori 普通for循环
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //itar 普通for循环
        for (int i = 0; i < arr.length; i++)
        {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList arrayList = new ArrayList();

    }
}
