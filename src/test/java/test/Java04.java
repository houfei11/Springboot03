package test;

import java.util.Scanner;

/**
 * 逻辑练习
 */
public class Java04 {
    /**
     * 题目：输入某年某月某日，判断这一天是这一年的第几天？
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请分别输入年月日");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        //天数
        int dayNum = 0;
        int[] month1;
        if (year % 400== 0||(year % 4== 0&&year%100!=0)){
            month1 = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        }else{
            month1 = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        }
        //判断这一天是第几天
        for (int i = 1; i <= month ; i++) {
            if (i == 1){
                dayNum = day;
            }else {
                dayNum += month1[i-2];
            }
        }
        System.out.println("这一天是:"+year+"年"+month+"月"+day+"日");
        System.out.println("这一天是这一年的第" +dayNum+ "天！！");
    }
}
