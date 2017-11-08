package main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example8 extends JFrame {
    public Example8(){
        this.setTitle("JFrameTest");
        this.setSize(200,300);
        JButton jb= new JButton("按钮");
        this.setLayout(new FlowLayout());
        this.add(jb);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args){
        new Example8();
    }
}
