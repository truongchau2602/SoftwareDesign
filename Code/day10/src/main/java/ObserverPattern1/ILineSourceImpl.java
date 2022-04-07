package ObserverPattern1;

import ObserverPattern1.ILineProcessor;
import ObserverPattern1.IlineSource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ILineSourceImpl implements IlineSource {
    private String line;
    private int count=0;
    ArrayList<ILineProcessor> procList = new ArrayList<ILineProcessor>();

    @Override
    public void startProc() {
        System.out.print("Enter line:");
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()) {

            String line = scan.nextLine();
            for(ILineProcessor lineProcessor: procList) {

                this.line = line;
                lineProcessor.process(line);
            }
        }

    }

    @Override
    public void attach(ILineProcessor proc) {
        procList.add(proc);
    }

    @Override
    public String getState() {
        return this.line;
    }

}
