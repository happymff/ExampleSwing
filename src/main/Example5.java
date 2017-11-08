package main;

import java.awt.*;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example5 {
    public static void main(String [] args){
        final Frame frame = new Frame("BorderLayout");
        frame.setLayout(new BorderLayout());
        frame.setSize(300,300);
        frame.setLocation(300,200);
        Button bt1= new Button("东部");
        Button bt2 = new Button("西部");
        Button bt3 = new Button("南部");
        Button bt4 = new Button("北部");
        Button bt5 = new Button("中部");
        frame.add(bt1,BorderLayout.EAST);
        frame.add(bt2,BorderLayout.WEST);
        frame.add(bt3,BorderLayout.SOUTH);
        frame.add(bt4,BorderLayout.NORTH);
        frame.add(bt5,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
