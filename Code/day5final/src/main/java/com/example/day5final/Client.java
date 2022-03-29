package com.example.day5final;

public class Client {
    public static void main (String[] args){
        ShapeFactory s = new ShapeFactory();
        Shape s1 = s.createShape("circle");
        s1.printType();

        ShapePrototype sp = new ShapePrototype();
        Circle c1 = (Circle) sp.createShape("circle");
        c1.printType();
    }
}
