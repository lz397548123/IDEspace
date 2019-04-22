package three;

/**
 * @ClassName: Manager
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/10 15:09
 * @Version: 1.0
 */
public class Manager extends Employees implements Display {
    private double wage;
    public Manager(String name, String id, double wage) {
        super(name, id, wage);
    }

    @Override
    public void display() {
        System.out.println("经理：");
        super.display();
    }
}
