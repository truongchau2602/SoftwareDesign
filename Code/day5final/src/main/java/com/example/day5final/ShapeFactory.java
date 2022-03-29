package com.example.day5final;

public class ShapeFactory {
    public Shape createShape(String type){
        if(type.equalsIgnoreCase("circle")){
            return new Circle();
        }
        if(type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        if(type.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
