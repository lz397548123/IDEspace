package company;

import java.util.Scanner;

/**
 * @ClassName: Prime
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/7/4 22:13
 * @Version: 1.0
 */
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大于1自然数（输入-1时结束）：");
        while(true) {
            int a = sc.nextInt();
            if (a == -1) {
                break;
            }
            if (isPrime(a)) {
                System.out.println(a+"：true");
            }
            else {
                System.out.println(a+"：false");
            }
        }


    }

    public static boolean isPrime(int src) {
        double sqrt = Math.sqrt(src);
        if (src < 2) {
            return false;
        }
        if (src == 2 || src == 3) {
            return true;
        }
        if (src % 2 == 0) {// 先判断是否为偶数，若偶数就直接结束程序
            return false;

        }
        for (int i = 3; i <= sqrt; i+=2) {
            if (src % i == 0) {
                return false;
            }
        }
        return true;
    }
}
