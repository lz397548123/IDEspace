package company;

import java.util.Scanner;

/**
 * @ClassName: Sum
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/3/27 8:49
 * @Version: 1.0
 */
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System .in);
        System.out.println("请输入两个数字，求出两数之间所有偶数的和：");
        System.out.println("请输入第一个数：");
        int m = sc.nextInt();
        System.out.println("请输入第二个数：");
        int n = sc.nextInt();
        //记录偶数的和
        int a = Math.max(m,n);
        int b = Math.min(m, n);

        //a和b之间不包括a和b
        b++;
        int sum = 0;
        while(b < a){
             if(b % 2 == 0) {
                 sum += b;
             }
              b++;
            }
        if(sum != 0) {
            System.out.println(m+" ~ "+n+"之间所有偶数之和为："+sum);
        } else {
            System.out.println(m+" ~ "+n+"之间没有偶数！！");
        }
    }
}
