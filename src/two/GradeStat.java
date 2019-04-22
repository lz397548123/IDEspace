package two;

/**
 * @ClassName: GradeStat
 * @Description: TODO
 * @Author: &#x6881;&#x58ee;
 * @Date: 2019/4/3 14:56
 * @Version: 1.0
 */
public class GradeStat {
    private String courseName;
    private int[] grades;
    public GradeStat(String name, int[] gradesArray) {
        this.courseName = name;
        this.grades = gradesArray;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void displayMessage() {
        System.out.println("欢迎查看以下成绩：");
        System.out.println(getCourseName()+"!");
        System.out.println();
    }

    public void processGrades() {
        outputGrades();
        System.out.printf("\n平均分是：%.2f\n",getAverage());
        System.out.printf("最低分是：  %d\n最高分是：  %d\n\n",
                getMinimum(),getMaximum());
        outputBarChart();
    }

    public int getMinimum() {
        int lowGrade = grades[0];
        for (int grade : grades) {
            if (grade < lowGrade)
                lowGrade = grade;
        }
        return lowGrade;
    }

    public int getMaximum() {
        int highGrade = grades[0];
        for (int grade : grades) {
            if(grade > highGrade)
                highGrade = grade;
        }
        return highGrade;
    }

    public double getAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total/grades.length;
    }

    public void outputBarChart() {
        System.out.println("成绩分布率：");
        int[] frequency = new int[11];
        for (int grade : grades) {
            ++frequency[grade/10];
        }
        for (int count=0; count<frequency.length; count++) {
            if (count == 10) {
                System.out.printf("%5d:",100);
            } else {
                System.out.printf("%02d-%02d:",
                        count*10,count*10+9);
            }
            for (int stars=0; stars<frequency[count]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void outputGrades() {
        System.out.println("成绩如下：\n");
        for (int student=0; student<grades.length; student++) {
            System.out.printf("Student %2d: %3d\n",student+1, grades[student]);
        }
    }

    public static void main(String [] args) {
        int[] gradesArray = {90, 89, 36, 89, 87, 76, 89, 92, 12, 90};
        GradeStat myGrade = new GradeStat("Java程序设计成绩",gradesArray);
        myGrade.displayMessage();
        myGrade.processGrades();
    }
}
