package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example11 extends JFrame {
    JButton sendBt;
    JTextField inputField;
    JTextArea chatContent;
    public Example11(){
        this.setLayout(new BorderLayout());
        chatContent = new JTextArea(12,34);
        JScrollPane showPane = new JScrollPane(chatContent);
        chatContent.setEditable(false);
        JPanel inputPanel = new JPanel();
        inputField = new JTextField(20);
        sendBt = new JButton("Send");
        sendBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = inputField.getText();
                if (content!=null && !content.trim().equals("")){
                    chatContent.append("This is "+content+"\n");
                }else {
                    chatContent.append("This cannot be null");
                }
                inputField.setText("");
            }
        });
        Label label = new Label("聊天 信息");
        inputPanel.add(label);
        inputPanel.add(inputField);
        inputPanel.add(sendBt);
        this.add(inputPanel,BorderLayout.SOUTH);
        this.add(showPane,BorderLayout.CENTER);
        this.setTitle("聊天窗口");
        this.setSize(300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args){
        new Example11();
    }
}
