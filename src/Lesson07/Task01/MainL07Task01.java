/**
 * Java OOP. Lesson 07.
 *
 * @author Oleg Khrulov
 * @version dated 02.05.2019
 */

package Lesson07.Task01;

public class MainL07Task01 {
    public static void main(String[] args) {
        Ac ac = new Ac();
        Cat catOne = new Cat("Push", ac, true);
        Cat catTwo = new Cat("Pull", ac, false);

        Thread threadOne = new Thread(catOne);
        Thread threadTwo = new Thread(catTwo);

        threadOne.start();
        threadTwo.start();
    }
}
