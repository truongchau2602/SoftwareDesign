package TutorialPoint;

import java.util.Arrays;

import java.util.Arrays;
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora","Albert"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    @Override
    public Iterator getOrderedIterator() {
        return new NameSortedIterator();
    }


    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }

    private class NameSortedIterator implements Iterator {

        public String[] sortedNames = sortArray();
        public String[] sortArray(){
            String sortedNames[]= names;
            Arrays.sort(sortedNames);
            return sortedNames;
        }
        int index;

        @Override
        public boolean hasNext() {

            if(index < sortedNames.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return sortedNames[index++];
            }
            return null;
        }
    }
}