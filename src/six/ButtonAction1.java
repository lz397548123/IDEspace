package six;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName: ButtonAction1
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/24 11:39
 * @Version: 1.0
 */
public class ButtonAction1 implements ActionListener {
    JTextField num;
    JLabel label;
    GameManager gameManager;
    int count;

    // 构造函数
    ButtonAction1(JTextField num, JLabel label, GameManager gameManager, int count) {
        this.num = num;
        this.label = label;
        this.gameManager = gameManager;
        this.count = count;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        gameManager.myrandom();
        label.setText("请再次输入一个100以内的整数！");
        count = 0;
        num.setText("");
    }
}
