package Generic;

public class Box<T> {
    //Object class is top most parent class of all java class
    T Container;

    public Box(T container){
        this.Container = container;
    }
    public T getValue(){
        return this.Container;
    }
}
