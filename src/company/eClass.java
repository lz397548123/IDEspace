package company;

/**
 * @ClassName: Second
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/5/26 13:46
 * @Version: 1.0
 */
class MyException extends Exception {
    String message;
    MyException(String str) {
        this.message = str; //把参数的引用传给message成员变量
    }
    @Override
    public String getMessage() {
        return message; //返回message成员变量
    }
}
abstract class A {
    abstract int f(int x,int y) throws MyException;
}
class B extends A {
    @Override
    int f(int x, int y) throws MyException {
        if(x<=100&&y<=100)//判断x、y都不大于100
        {
            throw new MyException("乘数超过100");   //抛出一个MyException对象，构造方法参数为“乘数超过100”
        }
        return x*y;
    }
}
public class eClass {
    public static void main (String args[]) {
        A a;
        a = new B();  //设计a对象的B类上转型对象
        try {
            System.out.println(a.f(12,10));
            System.out.println(a.f(111,10));  //使用f()方法时传入一个大于100的乘数
        } catch(MyException e) {
            e.printStackTrace();
        }
    }
}





