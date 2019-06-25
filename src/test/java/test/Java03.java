package test;

/**
 * 逻辑练习
 */
public class Java03 {
    /**
     * 题目:一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 高度
         */
        Double height = 100.00;
        /**
         * 米数
         */
        Double sum = 100d;
        for (int i = 1; i <= 10 ; i++) {
            height = height / 2;
            sum = sum + height * 2;
        }
        System.out.println("第10次反弹的高度为：" + height);
        System.out.println("第十次经过的米数：" + sum);
    }
}
