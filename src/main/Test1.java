package main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by mengfeifei on 2017/11/3.
 */
public class Test1 {
    public static void main(String[] args) {
        Frame f = new Frame("我的窗体");
        f.setSize(400, 300);
        f.setLocation(300, 200);
//        MyWindowListener1 mw = new MyWindowListener1();
//        f.addWindowListener(mw);
        Button btn = new Button("Exit");//创建按钮组件对象
        btn.setLocation(200,100);
        f.add(btn);//把按钮对象添加到窗口上
        //用内部类的方式为按钮组件注册监听器
        f.setVisible(true);
        btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
              System.exit(0);
            }
        });
    }
}
