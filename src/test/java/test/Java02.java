package test;

import java.util.Scanner;

/**
 * 逻辑练习
 */
public class Java02 {
    /**
     * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("请输入分数！！");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String score = (a >= 90) ? "A" : (a >=60 && a <= 89) ? "B" : "C";
        System.out.println("分数等级为："+ score);
    }
}
