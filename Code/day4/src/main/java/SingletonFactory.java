import java.util.ArrayList;

public class SingletonFactory {
    private static Singleton mySing =null;
    public void createSingleton (){
        mySing = Singleton.getInstance();
    }
    public Singleton getSingleton(){
        return mySing;
    }
    public void add2List(int num){
        mySing.getList().add(num);
    }
    public void showList(){
        ArrayList<Integer> integerList = mySing.getList();
        for(int i=0;i<integerList.size();i++){
            System.out.println(integerList.get(i));
        }
    }
}
