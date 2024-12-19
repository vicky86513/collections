package Generic;

import java.util.*;

public class Generic {
    public static void main(String[] args) {
        int value =5;
        List values = new ArrayList();
        values.add(7);
        values.add("Vicky");
        System.out.println(values);
//        int i = Integer.parseInt(values.get(1).toString()); // Error

        List<Integer> newVal = new ArrayList<Integer>(); // this will provide type safety so reduce run time
        newVal.add(7);
//        newVal.add("Vicky"); // Error in compile time

        Box<String> box = new Box<String>("water");
//        Box<String> box1 = new Box<String>(123);  // Error
        Box<Integer> box1 = new Box<Integer>(234);
        System.out.println(box.getValue());
        System.out.println(box1.getValue());

        Box<Boolean> box2 = new Box<Boolean>(true);
        box2.Container = false;
        System.out.println(box2.getValue());



    }
}
