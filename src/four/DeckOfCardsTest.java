package four;

/**
 * @ClassName: DeckOfCardsTest
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/17 16:01
 * @Version: 1.0
 */
public class DeckOfCardsTest {
    public static void main (String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();
        System.out.printf("%-20s%-20s%-20s%-20s\n","玩家1","玩家2","玩家3","玩家4");

        for (int i = 0; i < 13; i++) {
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                    myDeckOfCards.dealCard(),myDeckOfCards.dealCard(),
                    myDeckOfCards.dealCard(),myDeckOfCards.dealCard());
        }
    }
}
