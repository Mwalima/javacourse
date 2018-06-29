package com.loi.mwalima;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class testPersoon {

    public static void main(String[] args){

//        Persoon test = new Persoon("fsdfa","asdfasd","afd");
//        Persoon test1 = new Persoon("fsdfa","asdfasd","afd");
//        Persoon test2 = new Persoon("fsdfa","asdfasd","afd");
//
//
//        System.out.println(test.toonNAW());
//        System.out.println(test1 == test2);
//        System.out.println(test2.equals(test));

//        StringUtil test = new StringUtil();
//        System.out.println(StringUtil.fixSqlFieldValue("CREATE TABLE ' waarnemingen' "));

//        System.out.println(StringUtil.encodeHtmlTag("<html>"));
        Persoon p1 = new Persoon("Karel","achter","deurne");
        Persoon p2 = new Persoon("henk","klaar","assen");
        Persoon p3 = new Persoon("Manny","Delgado","Spain");



        ArrayList<Persoon>personen = new ArrayList<Persoon>();
        personen.add(p1);
        personen.add(p2);
        personen.add(p3);

        for(Persoon element:personen){
            System.out.println(element.getNaam());
        }

        ListIterator<Persoon>pers = personen.listIterator();
        while (pers.hasNext()){
            System.out.println(pers.next().toonNAW());
        }

        int[] testarray = new int[]{1,2,3,4,5,6};
        int[][] testarray2 ={{123},{1234123}};

        //String s = {'1','2','3'};
//        String s ="123";
//        String b = new String("123");
//
//        double[][] array3 = new double[3][4];
//
//        int[][] tabel = {{0,1,2},{3,4,5,6}};
//        System.out.println(tabel[1].length + " ");
//        System.out.println(tabel[1].getClass().isArray() + " ");
//        System.out.println(tabel[1][1]);
//        //array3=tabel;
//        System.out.println(array3[0]);

//        ArrayList<String> astr = new ArrayList<>();
//        astr.add("One");
//        astr.add("two");
//        astr.add("Three");
//        astr.add("Four");
//        astr.set(2,"Five");
//        List one =astr.subList(1,3);
//        for(String obj: one){
//            System.out.println(obj + " ");
//        }

//        System.out.println();
//        System.out.println(astr);
//        System.out.println(astr.get(1));

//        int[] arr = new int[5];
//        byte a = 5;
//        char b2 ='2';
//        long c = 10;
//        arr[0] =a;
//        arr[1]=b2;
//        arr[3]=(int)c;
//        System.out.println(arr[0] + arr[1] + arr[2]+ arr[3]);

//        String[] z = new String[3];
//        System.out.println("s[0] is " + z[0].toString());
//
//        String s1 = "asdfasdf";
//        String s2 = "asdfasdf";

        //char c = s1.charAt(s1.length()-1);
        System.out.println("Java is cool".matches("\\D*"));
        //String s3 = null;
        String ejg = "Game".replace('a','Z').trim().concat("Aa");
        ejg.substring(0,2);
        System.out.println(ejg);

    }
}
