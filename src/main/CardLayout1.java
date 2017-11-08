package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class CardLayout1 extends Frame implements ActionListener {
    Panel cardPanel = new Panel();
    Panel controlPanel = new Panel();
    Button nextButton, preButton;
    CardLayout cardLayout = new CardLayout();
    public CardLayout1() {
        setSize(300, 200);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                CardLayout1.this.dispose();
            }
        });
        cardPanel.setLayout(cardLayout);
        cardPanel.add(new Label("第一个界面", Label.CENTER));
        cardPanel.add(new Label("第二个界面", Label.CENTER));
        cardPanel.add(new Label("第三个界面", Label.CENTER));
        nextButton = new Button("下一张卡片");
        preButton = new Button("上一张卡片");
        nextButton.addActionListener(this);
        preButton.addActionListener(this);
        controlPanel.add(nextButton);
        controlPanel.add(preButton);
        this.add(cardPanel,BorderLayout.CENTER);
        this.add(controlPanel, BorderLayout.SOUTH);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==nextButton){
            cardLayout.next(cardPanel);
        }
        if (e.getSource()==preButton){
            cardLayout.previous(cardPanel);
        }
    }
}
