package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example4 {
    public static void main(String[] args){
        Frame f= new Frame("layout");
        f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
        f.setSize(200,300);
        f.setLocation(300,200);
        Button but1= new Button("第一个按钮");
        f.add(but1);
        but1.addActionListener(new ActionListener() {
            private int num=1;
            @Override
            public void actionPerformed(ActionEvent e) {
                f.add(new Button("第"+ ++num + "个按钮"));
                f.setVisible(true);
            }
        });
        f.setVisible(true);
    }
}
