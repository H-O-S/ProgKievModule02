/**
 * Java OOP. Lesson 10.
 *
 * @author Oleg Khrulov
 * @version dated 16.05.2019
 */

package Lesson10.Task01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainL10Task01 {
    public static void main(String[] args) {
        Map<Integer, String> number = new HashMap<>();
        number.put(5, "Five");
        number.put(1, "One");
        number.put(3, "Three");
        System.out.println(number);

        String text = number.get(30);
        System.out.println(text);

        number.put(1, "One");
        System.out.println(number);

//        Set<Integer> =

    }
}
