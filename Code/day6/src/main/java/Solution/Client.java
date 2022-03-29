package Solution;

public class Client {
    public static void main(String[] args){
        Employee CEO = new Employee("Joe");
        Employee headSales = new Employee("Mary");
        Employee headMarketing = new Employee("Ethan");
        Employee executer1 = new Employee("Mary Jr 1");
        Employee executer2 = new Employee("Mary Jr 2");
        Employee clerk1 = new Employee("John 1");
        Employee clerk2 = new Employee("John 2");
        Employee subExecuter = new Employee("Charles");
        CEO.add(headSales);
        CEO.add(headMarketing);
        headSales.add(executer1);
        headSales.add(executer2);
        executer1.add(subExecuter);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //headMarketing.show();
        //headSales.show();

        //CEO.show();
        headSales.show();
    }
}
