package com.example.day5final.newPattern;

public class Main {
    public static void main(String[]args){
        Factory f = new Factory();
        Huawei i = (Huawei) f.createLightning("Huawei");
        if(i!=null) {
            i.recharge();
        }
    }
}
