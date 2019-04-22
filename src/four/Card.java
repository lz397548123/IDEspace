package four;

/**
 * @ClassName: Card
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/17 14:35
 * @Version: 1.0
 */
public class Card {
    private String face;      //点数
    private String suit;      //花色，如红桃，黑桃，梅花，方块

    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    //显示一张牌
    @Override
    public String toString() {
        return suit+face;
    }
}
