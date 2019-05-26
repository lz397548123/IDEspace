package company;

/**
 * @ClassName: Student
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/5/26 14:31
 * @Version: 1.0
 */
public class Student extends Person{
    private int math;
    private int english;

    public Student(String name, String address, char sex, int age, int math,int english) {
        super(name, address, sex, age);
        this.math = math;
        this.english = english;
    }
    public Student() {

    }
    @Override
    public void print(){
        System.out.println("name="+name+",address="+address+",sex="+sex+",age="+age+",math="+math+",english="+english);
    }
}
