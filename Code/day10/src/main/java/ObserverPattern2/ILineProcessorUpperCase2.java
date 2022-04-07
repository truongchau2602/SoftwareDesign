package ObserverPattern2;

public class ILineProcessorUpperCase2 implements ILineProcessor2{
    ILineSource2 source;
    ILineProcessorUpperCase2(ILineSource2 source){
        this.source=source;
        source.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Line "+source.getCount()+"- Upper case:"+source.getState().toUpperCase());
    }


}
