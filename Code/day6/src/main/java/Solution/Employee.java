package Solution;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    //private String dept;
    private List<Employee> supervisee;
    Employee(String name){
        this.name=name;
        supervisee=new ArrayList<Employee>();
    }
    public String getName(){
        return name;
    }
    public void add(Employee e){
        supervisee.add(e);
    }
    public void remove(Employee e){
        supervisee.remove(e);
    }
    public List<Employee> getSupervisee(){
        return supervisee;
    }
    public void show(){
        for(int i=0;i<supervisee.size();i++){
            System.out.println(supervisee.get(i).getName());
            supervisee.get(i).show();
            /*
            if (supervisee.get(i).getSupervisee().size()!=0){
                supervisee.get(i).show();
            }*/
        }
    }
}
