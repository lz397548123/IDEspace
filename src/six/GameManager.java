package six;

import java.util.Random;

/**
 * @ClassName: GameMessage
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/24 11:17
 * @Version: 1.0
 */
public class GameManager {
    private int number = 0;// 随机数

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int guess(int number) {
        return Integer.compare(number, this.number);
    }

    // 再来一次
    public void myrandom() {
        Random random = new Random();
        // 产生一个1-100的一个随机数
        int num = 1+random.nextInt(99);
        setNumber(num);
    }

}
