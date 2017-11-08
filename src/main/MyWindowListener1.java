package main;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by mengfeifei on 2017/11/3.
 */
public class MyWindowListener1 extends WindowAdapter {
    public void windowClosing (WindowEvent e){
        Window window = (Window) e.getComponent();
        window.dispose();
    }

}
