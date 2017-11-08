package main;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example3 {
    public static void main(String [] args){
        final Frame f= new Frame("KeyEvent");
        f.setLayout(new FlowLayout());
        f.setSize(400,300);
        f.setLocation(300,200);
        TextField tf= new TextField(30);
        f.add(tf);
        f.setVisible(true);
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
               int KeyCode = e.getKeyCode();
               String s = KeyEvent.getKeyText(KeyCode);
                System.out.print("输入的内容为："+s+",");
                System.out.println("对应的KeyCode为："+KeyCode);
            }
        });
    }
}
