/**
 * Java OOP. Lesson 10.
 *
 * @author Oleg Khrulov
 * @version dated 16.05.2019
 */

/*
        Найти количество повторений каждого элемента
 */

package Lesson10.Task02;

import java.util.*;

public class MainL10Task02 {
    public static void main(String[] args) {
        Random rn = new Random();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            numberList.add(rn.nextInt(10));
        }

        Map<Integer, Integer> start = new HashMap<>();

        for (Integer element : numberList){
            Integer count = start.get(element);
            if (count == null){
                start.put(element, 1);
            } else {
                start.put(element, count + 1);
            }
        }

        System.out.println(start);

/*
        for (Integer element : numberList){
            if (start.containsKey(element)){
                start.put(element, start.get(element)+1);
            } else {
                start.put(element, 1);
            }
        }
*/

    }
}
