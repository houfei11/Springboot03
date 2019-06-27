package test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 逻辑练习
 */
public class Java09 {
    /**
     * 题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），
     * 计算出平均成绩，况原有的数据和计算出的平均分数存放在磁盘文件"stud"中。
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<StudentInfo> list = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            System.out.println("请分别输入学生号，姓名，三门课成绩：");
            int stuId = scanner.nextInt();
            String stuName = scanner.next();
            int score1 = scanner.nextInt();
            int score2 = scanner.nextInt();
            int score3 = scanner.nextInt();
            StudentInfo studentInfo = new StudentInfo(stuId,stuName,score1,score2,score3);
            list.add(studentInfo);
            writeToFile("F:\\score.txt", studentInfo.toString()+"\r\n");
        }
        scanner.close();
    }
    public static void writeToFile(String fileName,String content){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName, true);
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
