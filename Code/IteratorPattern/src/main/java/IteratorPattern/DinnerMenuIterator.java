import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {
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
    @Override
    public void remove(){
        if(current<=0){
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (menuItems[current-1]!=null){
            for(int i= current-1;i<(menuItems.length-1);i++){
                menuItems[i]=menuItems[i+1];
            }
            menuItems[menuItems.length-1]=null;
        }
    }
}
