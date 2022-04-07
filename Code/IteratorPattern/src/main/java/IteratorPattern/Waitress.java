import java.util.Iterator;

public class Waitress {
    Menu PancakeHouseMenu;
    Menu DinnerMenu;
    Waitress(Menu PancakeHouseMenu, Menu DinnerMenu){
        this.PancakeHouseMenu=PancakeHouseMenu;
        this.DinnerMenu=DinnerMenu;
    }

    public void printMenu(){

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
