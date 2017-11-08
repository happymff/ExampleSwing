package main;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example10 extends JFrame {
    public Example10(){
        this.setTitle("PanelDemo");
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        JPanel panel = new JPanel();
        panel.add(new JButton("按钮1"));
        panel.add(new JButton("按钮2"));
        panel.add(new JButton("按钮3"));
        panel.add(new JButton("按钮4"));
        scrollPane.setViewportView(panel);
        this.add(scrollPane, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,400);
        this.setVisible(true);
    }
    public static void main(String [] args){
     new Example10();
    }
}
