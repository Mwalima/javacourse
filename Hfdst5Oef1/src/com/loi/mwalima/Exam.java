package com.loi.mwalima;

import java.util.ArrayList;

public class Exam {

    public static int f(int i){
        switch (i){
            case 1:i+=2;
            case 2:i+=2;
            case 3:i+=2;
        }
        return i;
    }

    public static void wissel(int a, int b){
        int h;
        h = a;
        a=b;
        b = h;
    }

    public static void main(String[] args) {
//        int i = 10;
//
//        do
//            //zolang i < is dan 15 blijft hij dit doen !!!
//            while (i++ < 15)
//                //10+1 < 15
//
//                i = i + 20;
//            //11+20 = 31
//        while (i < 2);
        //System.out.println(i);

        //using enhanced forloop in regular loop
//        String[] num = new String[]{"[]", "+", "()"};
//
//        for (int g = 0; g < num.length; g++) {
//
//            for (String j : num) {
//
//                for (String h : num) {
//                    System.out.print(h);
//                }
//                System.out.println(" ");
//            }
//        }

//        int num1 = 20;
//        final int num2;
//        num2 =20;
//
//        switch (num1){
//            default:System.out.println("default");
//            case num2:System.out.println(4);
//            break;
//        }
//        int h = 10;
//        if (h++ > 10) {
//
//            System.out.println("true");
//        }
//        {
//        System.out.println("false");
//        }
//    System.out.println("ABC");

//        String[] s = new String[5];
//        System.out.println("s0 is van de lengte: " + s[0].toString());

//        int x;
//       //int sting = new int();
//       int[] sting = new int[7];
//       System.out.println("versie1");
//       for(x = 0; x < 7; x++){
//           sting[x] = x + 7;
//       }
//       for(x = 0; x < 7; x ++){
//           System.out.println(sting[x] + " ");
//       }
//
//        System.out.println("\nversie4");
//        x =0;
//        while(true){
//            sting[x] = x + 7;
//            x++;
//            if(x >= 7){
//                break;
//            }
//        }
//        for(x = 0; x < 7; x ++){
//            System.out.println(sting[x] + " ");
//        }


//        String[] string = new String[]{"Piet", "Hein"};
//
//        for(int i=0; i < 3; i++){
//
//            for(String s:string){
//                System.out.println(i + " " + s);
//
//                if(i == 0){
//                    break;
//                }
//            }
//        }
        //System.out.println(f(2));

        boolean v = true;
        int i = 0, w =2;

        while (v){
            w += 3;
            if(w > 8) v= false;
            System.out.println(++i);
        }
//
//        int a = 25, b=30,c=20;
//
//        if(a>b)wissel(a,b);
//        else if (a > c) wissel(a,c);
//        System.out.println(a +" "+ b+ " " +" "+ c);

//        ArrayList<StringBuilder>myarr = new ArrayList<>();
//        myarr.add(new StringBuilder("jan"));
//        myarr.add(new StringBuilder("piet"));
//
//        for(StringBuilder val:myarr){
//            System.out.println(val + " ");
//        }
//        for(StringBuilder val:myarr){
//            myarr.add(val);
//        }
//        for (StringBuilder val:myarr){
//            System.out.println(val + " ");
//        }

//        int two[][] = new int[2][3];
//        mijlabel:
//        for(int i = 0; i < two.length; i++){
//
//            for(int j = 0; j < two[i].length; j++){
//                two[i][j] = i + j;
//                if(i == 0) continue mijlabel;
//            }
//        }
    }


}