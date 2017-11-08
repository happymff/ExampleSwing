package main;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example1 {
    public static void main(String [] args){
        final Frame f= new Frame("WindowEvent");
        f.setSize(400,300);
        f.setLocation(300,200);
        f.setVisible(true);

        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("window opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("window closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("window closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("window 窗体图标化事件");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("window 窗体取消图标化事件");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("window 窗体激活事件");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("window 窗体停用事件");
            }
        });
    }
}
