package Lesson09.Task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainL09Task02 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(-3);
        myList.add(10);

        System.out.println(myList);

        Collections.sort(myList);

        System.out.println(myList);

        myList.add(1, 10);
        System.out.println(myList);

        myList.set(0, 15);
        System.out.println(myList);

        myList.remove(0);
        System.out.println(myList);

        Integer sum = 0;

        for (Integer element : myList){
            sum += element;
        }
        System.out.println("Sum = " + sum);

        sum = 0;

        Iterator<Integer> itr=myList.iterator();

        for(;itr.hasNext();){
            Integer element = itr.next();
            sum += element;
        }

        System.out.println("Sum = " + sum);

    }
}
