package ObserverPattern1;

public class Client {
    public static void main(String[] args){
        ILineProcessor count = new ILineProcessorCount();
        ILineProcessor upper = new ILineProcessorUpperCase();
        IlineSource source = new ILineSourceImpl();

        source.attach(count);
        source.attach(upper);
        source.startProc();
    }
}
