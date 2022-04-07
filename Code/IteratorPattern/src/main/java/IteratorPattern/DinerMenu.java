import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 4;
    int numberOfItems=0;
    MenuItem[] menuItems;
    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Soup", "Chicken with water",
                false, 2.99);
        addItem("Beef Hambuger","Beef inside hamburger",
                false, 3.99);
        addItem("Potato","French fried",
                true, 1.99);
        addItem("Vegetable","Tomato salad",
                true, 1.99);
    }
    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems<MAX_ITEMS){
            menuItems[numberOfItems]=item;
            numberOfItems++;
        } else{
            System.out.println("Sorry cannot add any items to menu");
            return;
        }
    }
    public MenuItem[] getMenuItem(){
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new DinnerMenuIterator();
    }
}
