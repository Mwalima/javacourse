package com.loi.mwalima;

public class InwonerGegevens extends Inwoner {

    Inwoner[] inwoners;

    public InwonerGegevens() {
        //initialize array and fill with inwoners
        inwoners = new Inwoner[1000];
        int a;
        byte b;

        for (int i = 0; i < 1000; i++) {
            a = (int) (100 * Math.random());
            b = (byte) (2 * Math.random());
            inwoners[i] = new Inwoner(a, b);
        }
    }

    public int getJeugd() {
        int jeugd = 0;

        for (Inwoner w : inwoners) {
            if (w.getLeetijd() <= 18) {
                jeugd++;
            }
        }
        return jeugd;
    }

    public String makeGeslacht(){
        String geslacht = "";
        for (Inwoner w:inwoners) {
            if(w.getGeslacht()< 1){
                geslacht ="man";
            }else{
                geslacht="vrouw";
            }
        }
        return geslacht;
    }
}
