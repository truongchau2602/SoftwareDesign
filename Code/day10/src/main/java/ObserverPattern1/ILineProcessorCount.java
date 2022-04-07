package ObserverPattern1;

import ObserverPattern1.ILineProcessor;

public class ILineProcessorCount implements ILineProcessor {

    @Override
    public void process(String line) {
        int i=0;
       System.out.println("Number characters:"+ line.length());
    }
}
