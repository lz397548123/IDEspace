package two;

import java.util.Scanner;

/**
 * @ClassName: Grade
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/3 14:45
 * @Version: 1.0
 */
public class Grade {
    public static void main(String[] args) {
        int SID;
        String name;
        float[] grade = new float[8];
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学号和姓名：");
        SID = in.nextInt();
        name = in.next();
        System.out.println("请输入6个分数：");
        for (int i=0; i<=5; i++) {
            grade[i] = in.nextInt();
            grade[6] += grade[i];
        }

        grade[7] = grade[6]/6;
        System.out.println("学生学号："+SID+"  学生姓名："+name);
        for (int i=0; i<=5; i++) {
            System.out.println("分数"+grade[i]);
        }
        System.out.println("总成绩："+grade[6]+"  平均成绩："+grade[7]);
    }
}
