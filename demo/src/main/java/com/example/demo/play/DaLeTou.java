package com.example.demo.play;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sya
 * @Description 选大乐透
 * @date 2020-10-19 14:39
 */
public class DaLeTou {
    public static void main(String[] args) {
//       for(int i =0;i < 19;i++){
           getNumberArray();
//       }
    }
    public static void getNumberArray(){
        //前区list集合
        List<Integer> list1 = new ArrayList<>();
        //后区list集合
        List<Integer> list2 = new ArrayList<>();
        //前区1-35，随机五个不重复
        while (list1.size() < 5) {
            int a = (int) (Math.random() * 35 + 1);
            if (!list1.contains(a)) {
                list1.add(a);
            }
        }
        //按升序排列
        Collections.sort(list1);
        System.out.print(list1);
        //后区1-12随机2个不重复
        while (list2.size() < 2) {
            int b = (int) (Math.random() * 12+1);
            if (!list2.contains(b)){
                list2.add(b);
            }
        }
        //按升序排列
        Collections.sort(list2);
        System.out.println(list2);
    }
}
