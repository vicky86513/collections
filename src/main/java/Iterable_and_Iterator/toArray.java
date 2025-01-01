package Iterable_and_Iterator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;

//1. Convert an arraylist to an array of Object type
// 2. Convert the arraylist to the array of Integer type
// 3. Convert the Integer array to int array and print it
// 4. Convert the arraylist to the primitive array and print it
// 5. create a integer Array and print it sum
// 6. create a List and print the sum

public class toArray {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        // 1
        Object[] arr = l1.toArray();
        for(Object i : arr){
            System.out.println(i);
        }
        //2
        System.out.println("---------------------this is for 2th Question----------------------------");
        Integer[] arr2 = new Integer[l1.size()];
        arr2 = l1.toArray(arr2);
        for(Integer x: arr2){
            System.out.println(x);
        }
        // 3
        System.out.println("---------------------this is for 3th Question----------------------------");
        int[] arr3 = Arrays.stream(arr2)
                .mapToInt(Integer :: intValue)
                .toArray();
        System.out.println(Arrays.toString(arr3));

        //4
        System.out.println("-----------------this is for 4th Question--------------------------------");
        int[] arr4 = l1.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(arr4));

        //5
        System.out.println("-------------------this is for 5th Question------------------------------");
        Integer[] arr5 = {1,2,3,4,5};
        int res = Arrays.stream(arr5)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(res);

        //6
        System.out.println("-------------------this is for 6th Question------------------------------");
        List<Integer> l6 = Arrays.asList(9,8,7,6,5);
        int l6Sum = l6.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("sum of l6Sum: " + l6Sum);
    }
}
