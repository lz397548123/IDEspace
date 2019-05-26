package company;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/5/26 14:30
 * @Version: 1.0
 */
public class Person {
    protected String name;
    protected String address;
    protected char sex;
    protected int age;

    public Person(String name,String address,char sex,int age){
        this.address = address;
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public Person(){

    }
    public void print(){
        System.out.println("name="+name+",address="+address+",sex="+sex+",age="+age);
    }
}
