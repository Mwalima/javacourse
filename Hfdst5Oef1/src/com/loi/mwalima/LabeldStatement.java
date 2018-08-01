package com.loi.mwalima;

public class LabeldStatement {

    public static void main(String[] args){
        String[] personen = new String[]{"Klaas",null,"Jan"};
        persoon:
        for(String element:personen){
            if(element.equals(null))
                break persoon;
            System.out.println(element);
        }
    }
}
