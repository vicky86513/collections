package Iterable_and_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1. Create two list l1 and l2 and check weather the value of l2 is present in l1 or not
2. l3 = {7,8,9} add this into l1
3. l4 ={3,4} remove this from l1
4. l5 = {1,2,3,4,5} retain this from l1
5. print l1 number which is even
 */
public class CollectionBulk {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        List<Integer> l2 = Arrays.asList(3,4);
        //1
        System.out.println("-------- question 1 -------------------");

        if(l1.containsAll(l2)){
            System.out.println("the value is present in l1");
        }else{
            System.out.println("the value is not present");
        }

        //2
        System.out.println("-------- question 2 -------------------");
        List<Integer> l3 = Arrays.asList(7,8,9);
        l1.addAll(l3);
        System.out.println(l1);

        //3
        System.out.println("-------- question 3 -------------------");
        List<Integer> l4 = Arrays.asList(3,4);
        l1.removeAll(l4);
        System.out.println(l1);

        //4
        System.out.println("-------- question 4 -------------------");
        List<Integer> l5 = Arrays.asList(1,2,3,4,5);
        l1.retainAll(l5);
        System.out.println(l1);

        //5
        System.out.println("-------- question 5 -------------------");
        l1.removeIf(n -> n%2==0 );
        System.out.println(l1);
    }
}
