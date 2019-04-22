package one;

import java.util.Random;

/**
 * @ClassName: CrapsGame
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/3/27 14:51
 * @Version: 1.0
 */
public class CrapsGame {
    Random randomNumbers = new Random();
    private enum Status { CONTINUE, WON, LOST };
    private final static  int SNAKE_EYES = 2;
    private final static  int TREY = 3;
    private final static  int SEVEN = 7;
    private final static  int YO_LEVEN = 11;
    private final static  int BOX_CARS = 12;

    private void play() {
        int myPoint = 0;
        Status gameStatus;
        //骰子数总和
        int sumOfDice = rollDice();
        switch (sumOfDice){
            //赢了
            case SEVEN : case YO_LEVEN :
                gameStatus = Status.WON;
                break;
            //输了
            case SNAKE_EYES : case TREY : case BOX_CARS :
                gameStatus = Status.LOST;
                break;
            //继续
            default:
                gameStatus = Status.CONTINUE;
                //myPoint 成为之前的点数
                myPoint = sumOfDice;
                System.out.println("Point is"+myPoint);
                break;
        }
        while (gameStatus == Status.CONTINUE){
            //重新开始掷骰子
            sumOfDice = rollDice();
            //如果掷骰子点数等于之前的点数，获胜
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            }
            //如果掷骰子点数等于7，输
            else if (sumOfDice == SEVEN) {
                gameStatus = Status.LOST;
            }
        }

        if (gameStatus == Status.WON) {
            System.out.println("Player wins!（玩家获胜）");
        } else {
            System.out.println("Player loses!（玩家输了）");
        }
    }
    //扔骰子
    private int rollDice() {
        //随机数  也就是掷骰子
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.println("Play rolled（掷骰子）"+die1+"+"+die2+"="+sum);
        return sum;
    }

    public static void main(String[] args) {
        CrapsGame game = new CrapsGame();
        game.play();
    }
}
