package ObserverPattern2;

public class Client {
    public static void main(String[] args){
        ILineSource2 source = new ILineSourceImpl2();
        new ILineProcessorCount2(source);
        new ILineProcessorUpperCase2(source);
        source.startProc();
    }
}
