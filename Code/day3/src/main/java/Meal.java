import java.util.ArrayList;

public class Meal {
    ArrayList<Items> itemList=null;
    public int showPrice(){
        int total=0;
        int i=0;
        for(i=0; i<itemList.size(); i++){
            total = total + itemList.get(i).getPrice();
        }
    return total;
    }
    public void showItem(){}
}
