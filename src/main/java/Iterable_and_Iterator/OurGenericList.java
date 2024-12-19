package Iterable_and_Iterator;
import java.util.*;

public class OurGenericList<T> implements Iterable{
    private T[] items;
    private int size;

    public OurGenericList(){
        size =0;
        items = (T[])new Object[100];
    }

    public void add(T item){
        items[size++] = item;
    }

    public T getItemAtIndex(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator(){

        return null;
    }
    private class OurGenericIterator implements Iterator<T>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

}
