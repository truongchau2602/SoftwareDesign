package IteratorPattern;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    HashMap menuItems;

    CafeMenu(){
        menuItems= new HashMap<String,MenuItem>();
        addItem("Cappuchino","It's cafe with milk",true,1.99);
        addItem("Latte","Another coffee",true,1.59);
        addItem("Milk tea","Milk and tea", true, 2.99);
    }
    public void addItem(String name, String description, boolean isVegetarian, double price) {
        MenuItem item = new MenuItem(name, description, isVegetarian, price);

        menuItems.put(name, item);

    }
    public HashMap getMenuItems(){
        return menuItems;
    }
    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
