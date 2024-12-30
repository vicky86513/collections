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

    public static <T> int countNum(T[] arr, T x){
        int count = 0;
        for(T num : arr){
            if(num.equals(x)){
                count++;
            }
        }
        return count;
    }
}
