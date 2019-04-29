/**
 * Java OOP. Lesson 06.
 *
 * @author Oleg Khrulov
 * @version dated 25.04.2019
 */

package Lesson06.Task01;

public class MainL06Task01 {
    public static void main(String[] args) {

        FactorialTask taskOne = new FactorialTask(10);
        FactorialTask taskTwo = new FactorialTask(10);
        FactorialTask taskThree = new FactorialTask(10);

        Thread threadOne = new Thread(taskOne);
        Thread threadTwo = new Thread(taskTwo);
        Thread threadThree = new Thread(taskThree);

        threadOne.start();
        threadTwo.start();
        threadThree.start();

//        try {
//            threadOne.join();
//            threadTwo.join();
//            threadThree.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



        threadOne.interrupt();
        threadTwo.interrupt();
        threadThree.interrupt();

        Thread thr = Thread.currentThread();

        int processor = Runtime.getRuntime().availableProcessors();
        System.out.println(processor);

        System.out.println(thr.getName() + " - STOP");
    }
}
