package company;

/**
 * @ClassName: Circle
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/7/4 20:56
 * @Version: 1.0
 */
public class Circle extends Point {
    protected double r;

    public Circle(double x, double y,double r) {
        super(x, y);
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double area(){
        return Math.PI*this.r*this.r;
    }
}

