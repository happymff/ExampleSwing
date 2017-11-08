package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example15 extends JFrame {
    public Example15(){
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu menu = new JMenu("操作");
        menuBar.add(menu);
        JMenuItem item1 = new JMenuItem("弹出窗口");
        JMenuItem item2 = new JMenuItem("关闭");
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(Example15.this,true);
                dialog.setTitle("弹出窗口");
                dialog.setSize(200,200);
                dialog.setLocation(50,50);
                dialog.setVisible(true);
            }
        });
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(item1);
        menu.addSeparator();
        menu.add(item2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new Example15();
    }
}
