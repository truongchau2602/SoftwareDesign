package IteratorPattern;

import IteratorPattern.Menu;
import IteratorPattern.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waitress {
    Menu PancakeHouseMenu;
    Menu DinnerMenu;
    List<Menu> menuList;
    Waitress(Menu PancakeHouseMenu, Menu DinnerMenu){
        this.PancakeHouseMenu=PancakeHouseMenu;
        this.DinnerMenu=DinnerMenu;
    }
    Waitress(){
        menuList = new ArrayList<Menu>();
    }
    public void addMenu(Menu menu){
        menuList.add(menu);
    }

    public void printMenu(){
        for(int i=0; i< menuList.size();i++){
            printMenu(menuList.get(i).createIterator());
        }
    }
    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice()+"\n");
        }
    }
    public void printBreakfastMenu(){
        Iterator iterator = PancakeHouseMenu.createIterator();
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice()+"\n");
        }
    }
    public void printDinnerMenu(){
        Iterator iterator = DinnerMenu.createIterator();
        while(iterator.hasNext())
        {
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice()+"\n");
        }
    }
}
