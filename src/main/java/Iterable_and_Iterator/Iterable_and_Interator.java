package Iterable_and_Iterator;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Iterable_and_Interator {
    public static <T> void removeEven(List<T> arr, T value){
        Iterator<T> it = arr.iterator();
        while(it.hasNext()){
            T x = it.next();
            if(x.equals(value)){
                it.remove();
            }
        }

    }
    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>();
        List<String> second = new ArrayList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(6);
        first.add(7);
        first.add(8);

        second.add("abc");
        second.add("def");
        second.add("ghi");
        second.add("jkl");

        System.out.println(first.size());
        System.out.println(first.isEmpty());
        System.out.println(first.contains(3));
        System.out.println(first.remove(6));
        System.out.println(first);

        Iterator <Integer> it = first.iterator();
        while(it.hasNext()){
            int x = it.next();
            if(x ==  2){
                System.out.println("this is for 2");
                it.remove();
            }else{
            System.out.println("it of first : " + x);
            }
        }
        System.out.println("List Before remove function for first : " + first);
        removeEven(first, 1);
        System.out.println("Final list for first : " + first);
        System.out.println("List Before remove function for second : " + second);
        removeEven(second, "abc");
        System.out.println("Final list for second : " + second);
    }
}
