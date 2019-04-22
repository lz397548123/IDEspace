package three;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/10 15:20
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("小明","10011",350000);
        manager.display();

        Worker worker = new Worker("小李","952156",130000);
        worker.display();
    }
}
