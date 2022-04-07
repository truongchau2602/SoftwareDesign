public class Main {
    public static void main(String[] args){
        Menu breakfast = new PancakeHouseMenu();
        Menu dinner = new DinerMenu();
        Waitress Alice = new Waitress(breakfast, dinner);
        Alice.printDinnerMenu();
    }
}
