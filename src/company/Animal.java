package company;

/**
 * @ClassName: Animal
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/7/4 20:58
 * @Version: 1.0
 */
public abstract class Animal {
    public abstract void cry();
}
class Cat extends Animal{
    @Override
    public void cry() {
        System.out.println("小猫喵喵叫");
    }
}
class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println("小狗汪汪叫");
    }
    public static void main(String[] args) {
        Cat c=new Cat();
        Dog d=new Dog();
        c.cry();
        d.cry();
    }
}

