package company;

/**
 * @ClassName: Lad
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/7/4 20:51
 * @Version: 1.0
 */
public class Lad {
    private double a,b,c;
    public Lad(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void setA(double a){
        this.a=a;
    }
    public double getA(){
        return a;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return b;
    }
    public void setC(double h){
        this.c=c;
    }
    public double getC(){
        return c;
    }
    public void area(){
        double s=0;
        s=(a+b)*c/2;
        System.out.println("梯形上底，下底，高,为："+a+" "+b+" "+c);
        System.out.println("梯形面积为："+s);
    }
}

