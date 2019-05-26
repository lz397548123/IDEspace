package company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName: JFrameDemo
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/5/26 15:00
 * @Version: 1.0
 */
public class JFrameDemo extends  JFrame{
    public JFrameDemo() {
        new StyleWindow();
        setTitle("单选按钮");
        setBounds(100,100,350,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JRadioButton jRadioButton1 = new JRadioButton("启用");
        JRadioButton jRadioButton2 = new JRadioButton("禁用");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jRadioButton1.setSize(200,230);
        jRadioButton1.setSelected(true);
        jRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("启用第一个单选按钮");
                jRadioButton1.setEnabled(false);
                jRadioButton2.setEnabled(true);
            }
        });

        jRadioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("启用第二个单选按钮");
                jRadioButton1.setEnabled(true);
                jRadioButton2.setEnabled(false);
            }
        });
        container.add(jRadioButton1);
        container.add(jRadioButton2);
        jRadioButton1.setEnabled(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JFrameDemo();
    }
}
