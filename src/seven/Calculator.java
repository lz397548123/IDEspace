package seven;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @ClassName: Calculator
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/5/8 15:17
 * @Version: 1.0
 */
public class Calculator implements ActionListener{
    JFrame f;
    JTextField tResult;
    JButton bNumber;
    JButton bOperator;
    JButton bOther;
    int t;
    boolean isDouble = false;   //是否为实数的标记变量
    double op2;    		//操作数
    StringBuffer str = new StringBuffer();
    public static void main(String[] args) {
        new Calculator();
    }

    public Calculator() {
        new StyleWindow();
        f = new JFrame("计算器");

        Container contentPane = f.getContentPane();
        contentPane.setLayout(new BorderLayout());

        tResult = new JTextField("0.", 20);
        tResult.setHorizontalAlignment(JTextField.RIGHT);
        tResult.setSize(1, 1);

        JPanel pTop = new JPanel();
        pTop.add(tResult);
        contentPane.add(pTop, BorderLayout.NORTH);

        JPanel pBottom = new JPanel();
        pBottom.setLayout(new BorderLayout());
        contentPane.add(pBottom, BorderLayout.CENTER);

        JPanel pRight = new JPanel();
        pRight.setLayout(new BorderLayout());

        JPanel pUp = new JPanel();
        pUp.setLayout(new GridLayout(1, 1));
        bOther = new JButton("C");
        bOther.addActionListener(this);
        bOther.setForeground(Color.RED);
        pUp.add(bOther);

        JPanel pDown = new JPanel();
        pDown.setLayout(new GridLayout(3, 5, 3, 2));

        bNumber = new JButton("7");
        bNumber.setForeground(Color.blue);
        bNumber.addActionListener(this);
        //setMargin():返回按钮边框和标签之间的空白。
        //Insets 对象是容器边界的表示形式。它指定容器必须在其各个边缘留出的空间。这个空间可以是边界、空白空间或标题。
        //Insets(int top, int left, int bottom, int right)
        //创建并初始化具有指定顶部、左边、底部、右边 inset 的新 Insets 对象。
        bNumber.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bNumber);

        bNumber = new JButton("8");
        bNumber.setForeground(Color.blue);
        bNumber.addActionListener(this);
        bNumber.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bNumber);

        bNumber = new JButton("9");
        bNumber.setForeground(Color.blue);
        bNumber.addActionListener(this);
        bNumber.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bNumber);

        bOperator = new JButton("/");
        bOperator.setForeground(Color.RED);
        bOperator.addActionListener(this);
        bOperator.setMargin(new Insets(3, 0, 3, 0));
        pDown.add(bOperator);

        bOperator = new JButton("sqrt");
        bOperator.setForeground(Color.blue);
        bOperator.addActionListener(this);
        bOperator.setMargin(new Insets(3, 0, 3, 0));
        pDown.add(bOperator);

        bNumber = new JButton("4");
        bNumber.setForeground(Color.blue);
        bNumber.addActionListener(this);
        bNumber.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bNumber);

        bNumber = new JButton("5");
        bNumber.setForeground(Color.blue);
        bNumber.addActionListener(this);
        bNumber.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bNumber);

        bNumber = new JButton("6");
        bNumber.setForeground(Color.blue);
        bNumber.addActionListener(this);
        bNumber.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bNumber);

        bOperator = new JButton("*");
        bOperator.setForeground(Color.RED);
        bOperator.addActionListener(this);
        bOperator.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bOperator);

        bOperator = new JButton("%");
        bOperator.setForeground(Color.blue);
        bOperator.addActionListener(this);
        bOperator.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bOperator);

        bNumber = new JButton("1");
        bNumber.setForeground(Color.blue);
        bNumber.addActionListener(this);
        bNumber.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bNumber);

        bNumber = new JButton("2");
        bNumber.setForeground(Color.blue);
        bNumber.addActionListener(this);
        bNumber.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bNumber);

        bNumber = new JButton("3");
        bNumber.setForeground(Color.blue);
        bNumber.addActionListener(this);
        bNumber.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bNumber);

        bOperator = new JButton("-");
        bOperator.setForeground(Color.RED);
        bOperator.addActionListener(this);
        bOperator.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bOperator);

        bOperator = new JButton("1/X");
        bOperator.setForeground(Color.blue);
        bOperator.addActionListener(this);
        bOperator.setMargin(new Insets(3, 3, 3, 3));
        pDown.add(bOperator);

        JPanel pDown1 = new JPanel();
        pDown1.setLayout(new GridLayout(1, 3, 2, 2));

        bOperator = new JButton("0");
        bOperator.setForeground(Color.blue);
        bOperator.addActionListener(this);
        bOperator.setMargin(new Insets(3, 3, 3, 3));
        pDown1.add(bOperator);

        bOperator = new JButton(".");
        bOperator.setForeground(Color.blue);
        bOperator.addActionListener(this);
        bOperator.setMargin(new Insets(3, 3, 3, 3));
        pDown1.add(bOperator);

        bOperator = new JButton("+");
        bOperator.setForeground(Color.RED);
        bOperator.addActionListener(this);
        bOperator.setMargin(new Insets(3, 3, 3, 3));
        pDown1.add(bOperator);

        bOperator = new JButton("=");
        bOperator.setForeground(Color.blue);
        bOperator.addActionListener(this);
        bOperator.setMargin(new Insets(5, 5, 5, 5));
        pDown1.add(bOperator);

        pRight.add(pUp, BorderLayout.NORTH);
        pRight.add(pDown, BorderLayout.CENTER);
        pRight.add(pDown1, BorderLayout.SOUTH);
        pBottom.add(pRight, BorderLayout.CENTER);

        //关闭窗体时退出程序
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //Dimension 类封装单个对象中组件的宽度和高度（精确到整数）。该类与组件的某个属性关联
        f.setSize(300, 250);
        f.setLocation(700, 400);
        f.setResizable(false);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String s = e.getActionCommand();
        String temp1 = tResult.getText();
        double dtemp1 = Double.parseDouble(temp1);
        double op1 = dtemp1;

        //如果是C则将当前计算结果重置为0
        switch (s) {
            case "C":
                tResult.setText("0.");
                str.replace(0, str.length(), "");
                break;
            case "1/X":
                tResult.setText("" + 1 / dtemp1);
                break;
            case "sqrt":
                //如果按键为sqrt，则将文本框中的内容求平方根
                tResult.setText("" + Math.sqrt(dtemp1));
                break;
            //执行加，减，乘，除，求余等运算
            case "+":
                t = 1;
                str.setLength(0);
                break;
            case "-":
                t = 2;
                str.setLength(0);
                break;
            case "*":
                t = 3;
                str.setLength(0);
                break;
            case "/":
                t = 4;
                str.setLength(0);
                break;
            case "%":
                t = 5;
                str.setLength(0);
                break;
            case "=":
                if (t == 1) {
                    tResult.setText("" + (op1 + op2));
                } else if (t == 2) {
                    tResult.setText("" + (op2 - op1));
                } else if (t == 3) {
                    tResult.setText("" + (op1 * op2));
                } else if (t == 4) {
                    tResult.setText("" + (op2 / op1));
                } else if (t == 5) {
                    tResult.setText("" + (op2 % op1));
                }
                break;
            case ".":
                isDouble = true;
                if (tResult.getText().trim().indexOf('.') != -1) {

                } else {
                    if ("0".equals(tResult.getText().trim())) {
                        str.setLength(0);
                        tResult.setText((str.append("0").append(s)).toString());
                    } else if ("".equals(tResult.getText().trim())) {
                        //如果初始显示为空则不做任何操作

                    } else {
                        tResult.setText((str.append(s)).toString());
                    }
                }
                break;
            case "0":
                if ("0.".equals(tResult.getText().trim())) {

                } else {
                    tResult.setText(str.append(s).toString());
                    op2 = Double.parseDouble(tResult.getText().trim());
                }
                break;
            default:
                tResult.setText(str.append(s).toString());
                op2 = Double.parseDouble(tResult.getText().trim());
                op2 = op1;
                break;
        }

    }

}
