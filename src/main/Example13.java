package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example13 extends JFrame {
    private ButtonGroup group;
    private JPanel panel;
    private JPanel pallet;
    public Example13(){
        pallet = new JPanel();
        this.add(pallet, BorderLayout.CENTER);
        panel= new JPanel();
        group = new ButtonGroup();
        addJRadioButton("灰");
        addJRadioButton("粉");
        addJRadioButton("黄");
        this.add(panel,BorderLayout.SOUTH);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    private void addJRadioButton(final String text){
        JRadioButton radioButton = new JRadioButton(text);
        group.add(radioButton);
        panel.add(radioButton);
        radioButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = null;
                if("灰".equals(text)){
                    color= Color.GRAY;
                }else if ("粉".equals(text)){
                    color= Color.PINK;
                }else if ("黄".equals(text)){
                    color = Color.YELLOW;
                }else {
                    color= Color.WHITE;
                }
                pallet.setBackground(color);
            }
        });
    }
    public static void main(String [] args){
        new Example13();
    }
}
