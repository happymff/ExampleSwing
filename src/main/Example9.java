package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example9 {
    public static void main(String [] args){
        JButton bt1 = new JButton("模态对话框");
        JButton bt2 = new JButton("非模态对话框");
        JFrame f = new JFrame("DialogDemo");
        f.setSize(300,200);
        f.setLocation(300,200);
        f.setLayout(new FlowLayout());
        f.add(bt1);
        f.add(bt2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        final JLabel label = new JLabel();
        final JDialog dialog = new JDialog(f,"Dialog");
        dialog.setSize(220,150);
        dialog.setLocation(350,250);
        dialog.setLayout(new FlowLayout());
        final JButton bt3 = new JButton("确定");
        dialog.add(bt3);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setModal(true);
                if (dialog.getComponents().length==1){
                    dialog.add(label);
                }
                label.setText("模式对话框，点击确定按钮关闭");
                dialog.setVisible(true);
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setModal(false);
                if (dialog.getComponents().length==1){
                    dialog.add(label);
                }
                label.setText("模式对话框，点击确定按钮关闭");
                dialog.setVisible(true);
            }
        });
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dialog.dispose();
            }
        });
    }
}
