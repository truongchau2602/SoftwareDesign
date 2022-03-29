import java.util.ArrayList;

public class PancakeHouseMenu {
    private ArrayList<MenuItem> menuItems;
    PancakeHouseMenu(){
        menuItems = new ArrayList<>();
        addItem("Pancake Breakfast","Pancake with egg",
                false,2.99);
        addItem("Blueberry Pancake","Pancake with berry",
                true, 3.49);
        addItem("Regular Pancake","Pancake with meat",
                false, 2.99);
    }
    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }
    public ArrayList getMenuItems(){
        return menuItems;
    }
    public Iterator createIterator(){
        return new BreakfastMenuIterator();
    }
}
