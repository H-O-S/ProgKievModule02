/**
 * Java OOP. Home Work 01.
 *
 * @author Oleg Khrulov
 * @version dated 09.04.2019
 */

/*
        Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
        Наделить его свойствами и методами. Создать несколько экземпляров объектов
        этого класса. Использовать эти объекты.
*/

package HW01.Task01;

import static HW01.Task01.Gender.FEMALE;
import static HW01.Task01.Gender.MALE;

public class MainHW01Task01 {
    public static void main(String[] args) {

        Cat catOne = new Cat();
        catOne.setName("Murzik");

        Cat catTwo = new Cat("Barsik", MALE, 8.5);

        Cat catThree = new Cat("Redhead","Red", "Grey",
                "Wild", FEMALE, 2010, 7.3);


        catOne.catPlaying();
        catTwo.catPlaying();
        catThree.catPlaying();

        catOne.sleep();
        catTwo.sleep();
        catThree.sleep();

        catOne.eat();
        catTwo.eat();
        catThree.eat();

        System.out.println(catOne);
        System.out.println(catTwo);
        System.out.println(catThree);

    }
}


/*
        while (!catOne.eat());
        while (!catTwo.eat());
        while (!catThree.eat());
*/

/*
        while (catOne.catPlaying());
        while (catTwo.catPlaying());
        while (catThree.catPlaying());
*/
