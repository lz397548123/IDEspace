package one;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName: GuessingGame
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/3/27 14:41
 * @Version: 1.0
 */
public class GuessingGame {
    public static void main(String[] args){
        int game;
        int guess; //存数字
        int counter = 0;
        Random randomNumbers = new Random();
        //会随机生成0-99的数 +1 即1-100
        game = 1 + randomNumbers.nextInt(100);
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("请输入你猜的数字（1~100的整数）：");
            guess = sc.nextInt();
            counter++;
            if (guess == game) {
                break;
            }
            if (guess > game) {
                System.out.println("你猜的数字太大！");
            } else {
                System.out.println("你猜的数字太小！");
            }
        }while(guess != game);
        System.out.println("恭喜你，你猜了"+counter+"次，你猜对了！");
    }
}
