package com.example.day5final.newPattern;

public class Factory {
    public MicroUSB createMicroUSB(String type){
        if(type == "Android") {
            return new Android();
        }
        return null;
    }
    public Lightning createLightning(String type){
        if (type == "Huawei"){
            return new Huawei();
        }
        return null;
    }
}
