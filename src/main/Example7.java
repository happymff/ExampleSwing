package main;

import java.awt.*;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example7 {
    public static void main(String [] args){
     // Layout layout = new Layout("GridBagLayout");
     // CardLayout1 cardLayout = new CardLayout1();
        final Frame f= new Frame("验证码");
        final Panel panel = new MyPanel();
        f.add(panel);
        f.setSize(200,100);
        //将Frame窗口居中
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
