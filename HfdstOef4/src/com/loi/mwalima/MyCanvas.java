package com.loi.mwalima;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;


class MyCanvas extends JApplet {

    private final static BasicStroke stroke = new BasicStroke(2.0f);
    private static final int x = 50;
    private static final int y = 50;
    private static int i = 0;
    private static int j = 0;
    private int getx = getx(i);
    private int gety = getx(j);

    public void init() {
        setBackground(Color.lightGray);
        setForeground(Color.white);
    }

    public int getx(int i){
        i = i * 10;
        return x + i;
    }

    public int gety(int j){
        j = j * 10;
        return y + j;
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Graphics2D g3 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setPaint(Color.gray);
        g2.draw(new Rectangle2D.Double(x, y, 200, 200));

        int grid[][] = new int[20][20];


        System.out.println(getx);

        for(i = 0; i < grid.length; i++) {

            for(j=0; j < grid.length; j++){

                getx = getx(i);
                gety = getx(j);
                g2.setPaint(Color.getHSBColor(x+y,i,j));
                g2.fill(new Rectangle2D.Double(getx,gety, 10, 10));

            }
        }

        //text
        g3.setPaint(Color.green);
        g3.drawString("Filled Rect chess", x+y, 250+y);
    }
}
