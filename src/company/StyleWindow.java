package company;

import javax.swing.*;

/**
 * @ClassName: StyleWindow
 * @Description: TODO
 * @Author: 梁壮
 * @Date: 2019/5/26 15:07
 * @Version: 1.0
 */
public class StyleWindow {
    public StyleWindow()
    {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}
