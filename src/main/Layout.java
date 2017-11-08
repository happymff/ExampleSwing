package main;

import java.awt.*;

/**
 * Created by mengfeifei on 2017/11/8.
 */
public class Layout extends Frame {
    public Layout(String title){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        this.setLayout(layout);
        c.fill = GridBagConstraints.BOTH;//设置横向纵向可以拉伸
        c.weightx = 1;//设置横向权重为1
        c.weighty = 1;//设置纵向权重为1
        this.addComponent("btn1",layout,c);
        this.addComponent("btn2",layout,c);
        this.addComponent("btn3",layout,c);
        c.gridwidth =  GridBagConstraints.REMAINDER;//添加的组件是本行最后一个组件
        this.addComponent("btn4",layout,c);
        c.weightx=0;
        c.weighty=0;
        addComponent("btn5",layout,c);
        c.gridwidth=1;//设置组件跨一个网格
        this.addComponent("btn6",layout,c);
        c.gridwidth =GridBagConstraints.REMAINDER;
        this.addComponent("btn7",layout,c);
        c.gridheight=2;
        c.gridwidth=1;
        c.weightx =1;
        this.addComponent("btn8",layout,c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridheight =1;
        this.addComponent("btn9",layout,c);
        this.addComponent("btn10",layout,c);
        this.pack();
        this.setVisible(true);

    }
    private void addComponent(String name, GridBagLayout layout, GridBagConstraints c){
        Button button = new Button(name);
        layout.setConstraints(button,c);
        this.add(button);
    }
}
