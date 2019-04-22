package three;

/**
 * @ClassName: Employees
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/10 14:53
 * @Version: 1.0
 */
public abstract class Employees implements Display {
    private String name;
    private String id;
    private double wage;
    public Employees(String name, String id, double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public void display() {
        System.out.println("姓名：" + getName());
        System.out.println("工号：" + getId());
        System.out.println("年薪：" + getWage());
        System.out.printf("月薪：$ %.2f\n\n" , getWage()/12);
    }
}
