package test;

import java.util.Scanner;

/**
 * 逻辑代码
 */
public class Java07 {
    /**
     * 题目：两个字符串连接程序
     * @param args
     */
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个字符串！！");
        String str = scanner.next();
        buffer.append(str);
        System.out.println("请输入第二个字符串！！");
        String str2= scanner.next();
        buffer.append(str2);
        String s = buffer.toString();
        System.out.println("合体字符串为     "+s);
    }
}
