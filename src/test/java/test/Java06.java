package test;

import java.io.Console;

/**
 * 逻辑练习
 */
public class Java06 {
    /**
     * 问题：共有1000瓶汽水，每喝完后一瓶得到的一个空瓶子，每3个空瓶子又能换1瓶汽水，喝掉以后又得到一个空瓶子，
     * 问总共能喝多少瓶汽水，最后还剩余多少个空瓶子？
     * @param args
     */
    public static void main(String[] args) {
        int qs = 1000;
        int kp = 0;
        int hd = 0;

        while (qs >= 1){
            kp++;
            if (kp == 3){
                qs++;
                kp = 0;
            }
            hd++;
            qs--;
        }
        System.out.println("喝掉:"+hd+"瓶\t空瓶:"+kp+ "个");
    }
}
