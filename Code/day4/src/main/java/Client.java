public class Client {
    public static void main(String[]args) {
        SingletonFactory factory = new SingletonFactory();
        factory.createSingleton();
        factory.add2List(3);
        factory.add2List(4);
        factory.showList();
    }
}
