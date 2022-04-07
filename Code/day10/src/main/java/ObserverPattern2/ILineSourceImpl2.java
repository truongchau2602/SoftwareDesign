package ObserverPattern2;

import ObserverPattern1.ILineProcessor;

import java.util.ArrayList;
import java.util.Scanner;

public class ILineSourceImpl2 implements ILineSource2{
    String line;
    int count;
    ArrayList<ILineProcessor2> processorList;
    ILineSourceImpl2(){
        line ="";
        count=0;
        processorList=new ArrayList<>();
    }
    @Override
    public void startProc() {
        System.out.println("Enter line:");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            count++;
            for(ILineProcessor2 processor:processorList){
                processor.update();
            }
        }
    }

    @Override
    public void attach(ILineProcessor2 processor) {
        processorList.add(processor);
    }

    @Override
    public String getState() {
        return line;
    }
    @Override
    public int getCount(){
        return count;
    }
}
