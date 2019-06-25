package test;

import java.util.Scanner;

/**
 * 逻辑练习
 */
public class Java05 {
    /**
     * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请分别输入三个整数！！");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b){
            int count;
            count = a;
            a = b;
            b = count;
        }
        if (a > c){
            int count;
            count = a;
            a = c;
            c = count;
        }
        if (b > c){
            int count;
            count = b;
            b = c;
            c = count;
        }
        System.out.println("三个数的从小到达排列顺序为：" +a+ "  " +b+ "  " +c);
    }
}
