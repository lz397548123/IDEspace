package company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * @ClassName: TableUse
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/7/4 21:23
 * @Version: 1.0
 */
public class TableUse extends JFrame {
    DefaultTableModel dt;
    JTable table;
    public TableUse() {
        super ("表格的使用");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //创建四个按钮
        JButton[] b = {new JButton("添加行"),new JButton("添加列"),new JButton("删除行"),new JButton("删除列")};
        //通过for语句将按钮添加到容器c
        for (int i=0; i<4; i++) {
            c.add(b[i]);
        }
        //创建一个空的数据表格
        dt = new DefaultTableModel();
        //通过数据模型创建数据
        table = new JTable(dt);
        //设置表格显示区域的大小
        table.setPreferredScrollableViewportSize(new Dimension(360,160));
        //设置表格列宽在表格缩放时的自动调整模式
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //添加滚动窗格
        JScrollPane js = new JScrollPane(table);
        c.add(js);
        //为按钮注册监听
        b[0].addActionListener(e -> {
            //调用方法
            addRow();
            System.out.println("添加一行");
        });
        b[1].addActionListener(e -> {
            //调用方法
            addColumn();
            System.out.println("添加一列");
        });
        b[2].addActionListener(e -> {
            //调用方法
            deleteRow();
            System.out.println("删除当前行");
        });
        b[3].addActionListener(e -> {
            //调用方法
            deleteColumn();
            System.out.println("删除当前列");
        });

    }

    //添加一列
    public void addColumn() {
        //获得二维表格的列数
        int cNum = dt.getColumnCount();
        //获取二维表格的行数
        int rNum = dt.getRowCount();
        String s = "列"+ (cNum+1);
        //返回第一个选定的列的索引值
        int c = table.getSelectedColumn();
        System.out.println("当前行号"+c);
        if (cNum==0||rNum==0||c<0) {
            dt.addColumn(s);
            return;
        }
        c++;
        //调用方法进行表头的处理
        Vector<String> vs = getColumnNames();
        vs.add(c,s);
        Vector data = dt.getDataVector();
        for (int i=0; i<data.size(); i++) {
            Vector e = (Vector) data.get(i);
            e.add(c,new String(""));
        }
        dt.setDataVector(data,vs);
    }

    //添加一行
    public void addRow() {
        int cNum = dt.getColumnCount();
        if (cNum == 0) {
            addColumn();
        }
        int rNum = dt.getRowCount();
        int r = getRowCurrent();
        System.out.println("当前行号为："+r);
        dt.insertRow(r,(Vector)null);
    }//addRow()方法结束

    //删除一列
    public void deleteColumn() {
        int cNum = dt.getColumnCount();
        if (cNum == 0) {
            return;
        }
        int c = table.getSelectedColumn();
        if (c < 0) {
            c = 0;
        }
        System.out.println("当前的列号为："+c);
        //调用方法对表头进行处理
        Vector<java.lang.String> vs = getColumnNames();
        vs.remove(c);
        Vector data = dt.getDataVector();
        for (int i=0; i<data.size(); i++) {
            Vector e = (Vector) data.get(i);
            e.remove(c);
        }
        dt.setDataVector(data,vs);
    }//deleteColumn()方法结束

    //删除一行
    public void deleteRow() {
        int rNum = dt.getRowCount();
        if (rNum > 0) {
            int rEdit = getRowCurrent();
            dt.removeRow(rEdit);
        }
    }//deleteRow()方法结束

    //取得列名称
    public Vector<java.lang.String> getColumnNames() {
        Vector<java.lang.String> vs = new Vector<>();
        int cNum = dt.getColumnCount();
        for (int i=0; i<cNum; i++) {
            vs.add(dt.getColumnName(i));
        }
        return vs;
    }//getColumnNames()方法结束

    //取得当前的行号
    public int getRowCurrent() {
        int r = table.getSelectedRow();
        if (r < 0) {
            r = 0;
        }
        return r;
    }//getRowCurrent()方法结束

    public static void main(String[] args) {
        TableUse app = new TableUse();
        app.setSize(360,260);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
