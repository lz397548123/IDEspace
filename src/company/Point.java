package company;

/**
 * @ClassName: Point
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/7/4 20:56
 * @Version: 1.0
 */
public class Point {
    protected double x;
    protected double y;
    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}

