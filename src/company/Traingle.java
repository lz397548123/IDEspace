package company;

/**
 * @ClassName: Traingle
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/7/4 20:49
 * @Version: 1.0
 */
public class Traingle{
    private double a,b,c;
    public Traingle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public boolean isTriangle(){
        if(a+b<c||a+c<b||b+c<a){
            return false;
        }
        else {
            return true;
        }
    }
    public double length(){
        if(isTriangle()) {
            return a+b+c;
        }
        return 0;
    }
    public double area(){
        double s=(a+b+c)/2;
        double area=(double)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return 0;
    }
}

