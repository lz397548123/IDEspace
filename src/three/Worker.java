package three;

/**
 * @ClassName: Worker
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/10 15:31
 * @Version: 1.0
 */
public class Worker extends Employees implements Display {
    private double wage;
    public Worker(String name, String id, double wage) {
        super(name, id, wage);
    }

    @Override
    public void display() {
        System.out.println("工人：");
        super.display();
    }
}
