package com.loi;


import java.util.Scanner;

public class TestStudent {

    Scanner keybord;

    public TestStudent(){
        keybord = new Scanner(System.in);

            System.out.println("C");

    }

    public double leesCijfer(){

        System.out.println("Geef cijfer voor wiskunde");
        double cijfer = keybord.nextDouble();
        return cijfer;
    }

    public static void swap(Student s1, Student s2){
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }

    void Go(){
        System.out.println("g");
    }
    static {
        System.out.println("x");
    }
    public static void main(String[] args){

        TestStudent test = new TestStudent();
        test.Go();
        //Student s1 = new Student();
//        s1.setNaam("Mwalima");
//        s1.setCijfer(test.leesCijfer());
//        s1.setCijfer(test.leesCijfer());
//        System.out.println(s1.toString());
//
//        Student s2 = new Student("piet");
//        s2.setCijfer(test.leesCijfer());
//        s2.setCijfer(test.leesCijfer());
//        System.out.println(s2.toString());

//        Student s3 = new Student("henk");
//        s3.setCijfer(2.4,5.5);
//
//        System.out.println(s3.toString());
//
//        Student s4 = new Student("henk");
//        Student s5 = new Student("Piet");
//
//        System.out.println(s4.getNaam());
//        System.out.println(s5.getNaam());
//
//        swap(s4,s5);
//
//        System.out.println(s4.getNaam());
//        System.out.println(s4.getNaam());
//
//        Student s6 = new Student();
//        int test  = 400;
//        s6.height = test;
//        System.out.println(s6.height);
//        s6.setHeight(400);
//
//        Student s = new Student();
//        s.name = "Ejava";
//
//        anothername(s);
//        System.out.println(s.name);
//
//        somemethod(s);
//        System.out.println(s.name);

    }



    static  void somemethod(Student s){
        s.name = "somemethod";
        System.out.println(s.name);
    }

    static void anothername(Student s){
        s = new Student();
        s.name = "anothername";
        System.out.println(s.name);
    }
    {
        System.out.println("Y");
    }
}
