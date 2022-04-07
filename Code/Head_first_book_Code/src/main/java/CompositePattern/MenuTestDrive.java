package CompositePattern;

public class MenuTestDrive {
    public static void main(String[] args){
        MenuComponent pancakeHouseMenu = new Menu("Pancake menu","Breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner menu","Menu");
        MenuComponent cafeMenu = new Menu("cafe menu","menu");
        MenuComponent allMenus = new Menu("All menus","All menu combined");

        allMenus.addComponent(pancakeHouseMenu);
        allMenus.addComponent(dinnerMenu);
        allMenus.addComponent(cafeMenu);

        dinnerMenu.addComponent(new MenuItem("Soup", "Chicken with water",
        false, 2.99));
        cafeMenu.addComponent(new MenuItem("Cappuchino","It's cafe with milk",true,1.99));
        pancakeHouseMenu.addComponent(new MenuItem("Pancake Breakfast","Pancake with egg",
                false,2.99));

    }
}
