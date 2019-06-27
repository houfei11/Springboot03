package test;

public class StudentInfo {

    /**
     * 学生号
     */
    private int stuId;
    /**
     * 学生姓名
     */
    private String stuName;
    /**
     * 成绩1
     */
    private float score1;
    private float score2;
    private float score3;

    public StudentInfo(int stuId, String stuName, float score1, float score2, float score3) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    /**
     * 计算平均数
     */
    private float avgScore(){
        return (score1 + score2 + score3) / 3;
    }

    public String toString(){
        return "学号：" + stuId +
                "  姓名：" + stuName +
                "  成绩1：" + score1 +
                "  成绩2：" + score2 +
                "  成绩3：" + score3 +
                "  平均成绩：" + avgScore();
    }
}
