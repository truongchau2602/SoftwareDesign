import java.util.ArrayList;

public class BreakfastMenuIterator implements Iterator {
    private ArrayList<MenuItem> breakfastList;
    private int current;
    BreakfastMenuIterator(){
        PancakeHouseMenu menu = new PancakeHouseMenu();
        breakfastList= menu.getMenuItems();
        current = 0;
    }
    @Override
    public boolean hasNext(){
        if(current< breakfastList.size()){
            return true;
        }
        return false;
    }

    @Override
    public MenuItem next() {
        MenuItem item;
        if(hasNext()==true) {
            item = breakfastList.get(current);
        } else return null;
        current++;
        return item;
    }
}
