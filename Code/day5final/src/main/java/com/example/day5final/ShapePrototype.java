package com.example.day5final;

import java.util.HashMap;
import java.util.Locale;

public class ShapePrototype {
    HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();
    ShapePrototype(){
        shapeMap.put("circle", new Circle());
        shapeMap.put("rectangle", new Rectangle());
        shapeMap.put("square", new Square());
    }
    public Shape createShape(String type){
        if(type.equalsIgnoreCase("circle")){
            return clone(type);
        }
        if(type.equalsIgnoreCase("rectangle")){
            return clone(type);
        }
        if(type.equalsIgnoreCase("Square")){
            return clone(type);
        }
        return null;
    }
    public Shape clone(String type){
        return shapeMap.get(type.toLowerCase());
    }
}
