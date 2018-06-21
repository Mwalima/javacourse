package com.loi.mwalima;

import javax.swing.*;

public class testArray{
    public static void main(String[] args){
//        JFrame window = new JFrame();
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.setBounds(50, 50, 300, 350);
//
//        window.getContentPane().add(new MyCanvas());
//        window.setVisible(true);

        String arrayTest[][] = new String[5][5];

        for(int i = 0; i <arrayTest.length; i++){
            for(int j = 0; j < arrayTest.length; j++){

                arrayTest[i][j] = new String("test"+ i +"fsdaf"+j);
                System.out.println(arrayTest[i][j]);
            }
            System.out.println();
        }
    }
}
