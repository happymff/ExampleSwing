package main;

import java.awt.*;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Example6 {
    public static void main(String [] args){
        final Frame f = new Frame("GridLayout");
        f.setLayout(new GridLayout(3,3));
        f.setSize(300,300);
        f.setLocation(300,200);
        for (int i =1; i<=9;i++){
            Button btn = new Button("btn"+i);
            f.add(btn);
        }
        f.setVisible(true);
    }
}
