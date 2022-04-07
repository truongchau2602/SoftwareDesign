package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;
    Menu(String name, String description){
        this.name=name;
        this.description=description;
    }
    public void addComponent(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChildren(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    public void print(){
        System.out.println("Menu name:"+getName());
        System.out.println(getDescription());
        System.out.println("-----------------------");
        if(menuComponents.size()==0||menuComponents==null) {
            return;
        }
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            /*
            Menu menu = (Menu) iterator.next();
            MenuItem menuItem = (MenuItem) iterator.next();
            menuItem.print();
            menu.print();
             */
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }

    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
}
