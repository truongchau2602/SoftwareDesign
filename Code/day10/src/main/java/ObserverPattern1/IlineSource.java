package ObserverPattern1;

import ObserverPattern1.ILineProcessor;

public interface IlineSource {
    public void startProc();
    public void attach(ILineProcessor proc);
    public String getState();
}
