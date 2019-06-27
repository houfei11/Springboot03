package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 逻辑练习
 */
public class Java08 {
    /**
     * 题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。
     * @param args
     */
    public static void main(String[] args) {
        //定义集合
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 50 ; i++) {
            list.add(i);
        }
        for (int i = 0; i < 7 ; i++) {
            int v = (int)(Math.random() * list.size());
            System.out.println(list.get(v) + ":");
            for (int j = 0; j < list.get(v) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
