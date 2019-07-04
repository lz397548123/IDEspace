package company;

/**
 * @ClassName: Narcissistic
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/7/4 22:29
 * @Version: 1.0
 */
public class Narcissistic {

    public static void main(String[] args){
        //用循环遍历所有的三位数
        for(int i = 100;i <= 1000;i++){
            //取出这个三位数的百位数
            int a = i / 100;
            //取出这个三位数的十位数
            int b = i % 100 / 10;
            //取出这个三位数的个位数
            int c = i % 10;
            //判断是否为水仙花数
            if(a * a * a + b * b *  b + c * c * c == i){
                System.out.println(i);
            }
        }
    }
}
