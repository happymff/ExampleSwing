package main;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example2 {

    public static void main(String [] args){
        final Frame f= new Frame("WindowEvent");
        f.setLayout(new FlowLayout());
        f.setSize(300,200);
        f.setLocation(300,200);
        Button but= new Button("Button");
        f.add(but);
        f.setVisible(true);
        but.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("鼠标点击完成事件");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("鼠标按下事件");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("鼠标放开事件");

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("鼠标点击完成事件");

            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("鼠标移出按钮区域事件");

            }
        });
    }
}
