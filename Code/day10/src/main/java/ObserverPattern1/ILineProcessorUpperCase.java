package ObserverPattern1;

import ObserverPattern1.ILineProcessor;

public class ILineProcessorUpperCase implements ILineProcessor {

    @Override
    public void process(String line) {
        System.out.println("Upper case:"+line.toUpperCase());
    }
}
