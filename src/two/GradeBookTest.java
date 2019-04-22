package two;

/**
 * @ClassName: GradeBookTest
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/3 19:52
 * @Version: 1.0
 */
public class GradeBookTest {
    public static void main(String [] args) {
        int[][] gradesArray = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90},
                {100, 81, 82}, {83, 65, 85}, {78, 87, 65},
                {85, 75, 83}, {91, 94, 100}, {76, 72, 74},
                {87, 93, 73}};
        GradeBook myGradeBook = new GradeBook("Java程序设计", gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}
