public class Employee {
    private String role;
    private int priority;
    Employee(String role, int priority){
        this.role=role;
        this.priority= priority;
    }
    public String getRole(){
        return role;
    }
    public int getPriority(){
        return priority;
    }
}
