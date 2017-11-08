package main;

import java.awt.*;
import java.util.Random;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class MyPanel extends Panel{
    public void  paint(Graphics g){
        int width = 160;
        int height = 40;
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0,width,height);
        g.setColor(Color.BLACK);
        g.drawRect(0,0,width-1,height-1);
        Random r = new Random();
        for (int i =0 ;i<100;i++){
            int x = r.nextInt(width)-2;
            int y = r.nextInt(height)-2;
            g.drawOval(x,y,2,2);
        }
        g.setFont(new Font("黑体",Font.BOLD,30));
        g.setColor(Color.BLUE);
        char[] chars = ("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
        StringBuilder sb= new StringBuilder();
        for(int i =0; i < 4; i ++){
            int pos =r.nextInt(chars.length);
            char c = chars[pos];
            sb.append(c+" ");
        }
        g.drawString(sb.toString(),20,30);
    }
}
