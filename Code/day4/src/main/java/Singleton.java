import java.util.ArrayList;

public final class Singleton {
    private ArrayList<Integer> integerList=new ArrayList<Integer>();
    private static final Singleton INSTANCE = new Singleton();
    protected Singleton(){
        System.out.println("A new singleton has been created");
    }
     public static Singleton getInstance(){
        return INSTANCE;
     }
     public ArrayList<Integer> getList(){
        return integerList;
     }
}
