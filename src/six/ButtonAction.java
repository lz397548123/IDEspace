package six;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName: ButtonAction
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/24 11:28
 * @Version: 1.0
 */
public class ButtonAction implements ActionListener {
    JTextField num;
    JLabel label;
    GameManager gameManager;
    int count;

    // 构造函数
    ButtonAction(JTextField num, JLabel label, GameManager gameManager, int count) {
        this.num = num;
        this.label = label;
        this.gameManager = gameManager;
        this.count = count;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int number = Integer.parseInt(num.getText());
        int flag;
        flag = gameManager.guess(number);
        if (flag == 1) {
            label.setText(number + "\t                 这个数太大了");
            count++;
        } else if (flag == -1) {
            label.setText(number + "\t                 这个数太小了");
            count++;
        } else if (flag == 0) {
            count++;
            label.setText("恭喜你，猜对了！"+"猜了"+count+"次");
        }
        num.setText("");
        num.requestFocus();
    }
}
