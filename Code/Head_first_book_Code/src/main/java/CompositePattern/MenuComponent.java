package CompositePattern;

public abstract class MenuComponent {
    public void addComponent(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    };
    public void print(){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChildren(){
        throw new UnsupportedOperationException();
    }
    public void remove(){throw new UnsupportedOperationException()};
    public String getName(){ throw new UnsupportedOperationException();};
    public String getDescription(){ throw new UnsupportedOperationException();};
    public boolean isVegetarian(){throw new UnsupportedOperationException();};
    public double getPrice(){throw new UnsupportedOperationException();};



}
