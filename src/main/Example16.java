package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example16 extends JFrame {
    private JPopupMenu popupMenu;
    public Example16(){
        popupMenu = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("refresh");
        JMenuItem item2 = new JMenuItem("create");
        JMenuItem item3 = new JMenuItem("exit");
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        popupMenu.add(item1);
        popupMenu.add(item2);
        popupMenu.addSeparator();
        popupMenu.add(item3);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton()==e.BUTTON3){
                    popupMenu.show(e.getComponent(),e.getX(),e.getY());
                }
            }
        });
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String [] args){
        new Example16();
    }
}
