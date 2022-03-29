public class Waitress {
    public void printMenu(){

    }
    public void printBreakfastMenu(){
        PancakeHouseMenu menu = new PancakeHouseMenu();
        Iterator iterator = menu.createIterator();
        while(iterator.hasNext()){
            MenuItem item = iterator.next();
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice()+"\n");
        }
    }
    public void printDinnerMenu(){
        DinerMenu menu = new DinerMenu();
        Iterator iterator = menu.createIterator();
        while(iterator.hasNext())
        {
            MenuItem item = iterator.next();
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice()+"\n");
        }
    }
}
