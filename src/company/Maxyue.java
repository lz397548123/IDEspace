package company;

/**
 * @ClassName: Maxyue
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/7/4 20:54
 * @Version: 1.0
 */
public class Maxyue { // 最大公约数类，取名自英文各首字母
    public int f(int a,int b){
        if(a < b){  // 保证a为最大值
            int temp = a;
            a = b;
            b = temp;
        }
        while(b > 0){ // 求最大公约数
            if(a == b){
                return a;
            }else{
                int temp = a%b;
                a = b;
                b = temp;
            }
        }
        return a;
    }
}

class Minbei extends Maxyue{// 最小公倍数类，取名自英文各首字母
    @Override
    public int f(int a, int b){ // 方法重写，求最小公倍数
        int m = super.f(a, b);
        int result = a*b/m;
        return result;
    }
}


