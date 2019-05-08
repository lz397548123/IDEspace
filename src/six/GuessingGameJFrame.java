package six;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName: GuessingGameJFrame
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/4/24 11:09
 * @Version: 1.0
 */
public class GuessingGameJFrame extends JFrame {
    GameManager gameManager = new GameManager();
    JLabel label;
    JLabel label1;
    JLabel label2;
    JTextField textField;
    JButton button;// 按钮“猜 ”
    JButton button1;// 按钮“新一轮”
    JButton button2;// 按钮“退出游戏”
    int count;      //猜的次数
    /*
     * 构造方法
     */
    public GuessingGameJFrame() {

        new StyleWindow();

        // 程序一运行先产生一个随机数
        gameManager.myrandom();

        // 设置Container
        Container container = getContentPane();
        /*
         * 设置边界布局
         */
        container.setLayout(new BorderLayout());

        // 上
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());//设置布局
        textField = new JTextField();
        label1 = new JLabel("请输入你要猜的数字：");
        panel.add(label1, BorderLayout.WEST);
        panel.add(textField,BorderLayout.CENTER);

        // 中
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        label = new JLabel("请输入一个100以内的整数");
        label2 = new JLabel("游戏情况：");
        panel1.add(label2, BorderLayout.WEST);
        panel1.add(label, BorderLayout.CENTER);//添加监听

        // 下
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 3));//设置布局
        button = new JButton("猜");
        //添加监听
        button.addActionListener(new ButtonAction(textField, label, gameManager, count));
        button1 = new JButton("新一轮");
        //添加监听
        button1.addActionListener(new ButtonAction1(textField, label, gameManager, count));
        button2 = new JButton("退出游戏");
        //添加监听
        button2.addActionListener(new ButtonAction2());
        panel2.add(button);
        panel2.add(button1);
        panel2.add(button2);

        container.add(panel, BorderLayout.NORTH);//上
        container.add(panel1, BorderLayout.CENTER);//中
        container.add(panel2, BorderLayout.SOUTH);//下

        /*
         * 回车监听事件
         * 键盘点击回车，实现和点击“猜”按钮一样的功能
         */
        textField.addActionListener(new ButtonAction(textField, label, gameManager, count));

        setTitle("猜字游戏");// 设置窗口的标题
        setSize(400, 250);// 设置大小
        setLocation(700, 500);// 设置窗口出现的位置
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);// 可视化设置
    }
}
