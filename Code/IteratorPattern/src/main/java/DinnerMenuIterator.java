public class DinnerMenuIterator implements Iterator{
    private MenuItem[] menuItems;
    int current;
    DinnerMenuIterator(){
        DinerMenu menu = new DinerMenu();
        menuItems= menu.getMenuItem();
        current=0;
    }
    @Override
    public boolean hasNext(){
        if(current< menuItems.length){
            return true;
        }
        return false;
    }
    @Override
    public MenuItem next(){
        MenuItem item;
        if(hasNext()==true){
            item = menuItems[current];
        } else return null;
        current++;
        return item;
    }
}
