package com.loi;

public class Convertor {

    public static int convertValue(double value ){
        return (int)value;
    }

    public static double convertValue(int value ){
        return (double)value;
    }

    public static double convertValue(double value, int cijferachterdekomma){
        double deel = Math.pow(10.0,cijferachterdekomma);
        double result = value * deel;
        result += 0.5;
        result = (int)result;
        result /=deel;
        return result;
    }
}
