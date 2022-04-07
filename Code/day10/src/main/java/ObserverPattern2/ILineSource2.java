package ObserverPattern2;

public interface ILineSource2 {
    public void startProc();
    public void attach(ILineProcessor2 processor);
    public String getState();
    int getCount();
}
