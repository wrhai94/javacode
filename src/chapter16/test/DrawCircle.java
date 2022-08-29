package chapter16.test;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle (){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(200, 200);
        // 界面关闭，结束程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}

class MyPanel extends JPanel {


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 椭圆形，width 和 height 相等时，为圆形。
        g.drawOval(10, 10, 100, 100);
    }
}