package ObserverPattern2;

public class ILineProcessorCount2 implements  ILineProcessor2{
    ILineSource2 source;
    ILineProcessorCount2(ILineSource2 source){
        this.source=source;
        source.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Line "+source.getCount()+"- Number of characters:"+source.getState().length());
    }
}
