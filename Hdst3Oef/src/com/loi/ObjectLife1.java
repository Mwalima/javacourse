package com.loi;


public class ObjectLife1 {

    public static void main(String[] args){
        Exam exam = new Exam();
        exam.setName("test");
        //exam = null;//object deinitialized
//       exam = new Exam();
//       exam.setName("php");
        System.out.println(exam.getName());
       //System.out.println("De teller " + Exam.teller);
    }
}
