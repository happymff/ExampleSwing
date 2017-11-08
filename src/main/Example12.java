package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example12 extends JFrame {
    private JCheckBox italic;
    private JCheckBox bold;
    private JLabel label;
    public Example12(){
        label = new JLabel("Welcome!!!",JLabel.CENTER);
        label.setFont(new Font("宋体", Font.PLAIN,20));
        this.add(label);
        JPanel panel = new JPanel();
        italic = new JCheckBox("ITALIC");
        bold = new JCheckBox("BOLD");
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mode = 0;
                if (bold.isSelected()){
                    mode += Font.BOLD;
                }
                if (italic.isSelected()){
                    mode +=Font.ITALIC;
                }
                label.setFont(new Font("宋体",mode,20));
            }
        };
        italic.addActionListener(listener);
        bold.addActionListener(listener);
        panel.add(italic);
        panel.add(bold);
        this.add(panel,BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new Example12();
    }
}
