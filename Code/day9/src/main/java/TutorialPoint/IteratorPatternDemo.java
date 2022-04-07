package TutorialPoint;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        String checkName="Hoang";
        int err=0;
        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            if(name == checkName){
                err++;
            }
        }
        if(err==0){
            System.out.println("There is no Hoang");
        } else{
            System.out.println("Hoang in the name repo");
        }
        for(Iterator iter = namesRepository.getOrderedIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println(name);
        }
    }
}
