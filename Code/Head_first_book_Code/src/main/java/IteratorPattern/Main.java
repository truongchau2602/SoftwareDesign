package IteratorPattern;

import IteratorPattern.DinerMenu;

public class Main {
    public static void main(String[] args){
        Menu breakfast = new PancakeHouseMenu();
        Menu dinner = new DinerMenu();
        Menu cafe = new CafeMenu();
        Waitress Alice = new Waitress();
        Alice.addMenu(breakfast);
        Alice.addMenu(dinner);
        Alice.addMenu(cafe);
        Alice.printMenu();
        //Alice.printDinnerMenu();
    }
}
