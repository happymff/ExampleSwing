package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example14 extends JFrame {
    private JComboBox comboBox;
    private JTextField textField;
    public Example14(){
        JPanel panel = new JPanel();
        comboBox = new JComboBox();
        comboBox.addItem("请选择城市");
        comboBox.addItem("北京");
        comboBox.addItem("天津");
        comboBox.addItem("南京");
        comboBox.addItem("上海");
        comboBox.addItem("重庆");
        textField = new JTextField(20);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = (String) comboBox.getSelectedItem();
                if ("请选择城市".equals(item)){
                    textField.setText("");
                }else {
                    textField.setText("您选择的城市是："+item);
                }
            }
        });

        panel.add(comboBox);
        panel.add(textField);
        this.add(panel, BorderLayout.NORTH);
        this.setSize(350,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new Example14();
    }
}

