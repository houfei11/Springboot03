package test;

/**
 * 逻辑练习
 */
public class Java01 {

    /**
     * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
     * 假如兔子都不死，问每个月的兔子总数为多少？
     * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
     * @param args
     */
    public static void main(String[] args) {
        /**月份*/
        int month;
        /**上个月兔子数量*/
        int sum = 1;
        /**这个月生兔子的总和*/
        int newSum = 1;
        /**用来存储兔子数量*/
        int count;
        System.out.println("第1个月兔子的数量为：1对");
        System.out.println("第2个月兔子的数量为：1对");
        for (month = 3; month < 24 ; month++) {
            count = newSum; //这个月
            newSum = sum + newSum;
            sum = count;
            System.out.println("第"+month+"个月兔子的数量为："+newSum+"对");
        }
    }
}
