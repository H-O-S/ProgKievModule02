/**
 * Java OOP. Home Work 01.
 *
 * @author Oleg Khrulov
 * @version dated 09.04.2019
 */

/*
        Описать класс «Triangle». В качестве свойств возьмите длины сторон
        треугольника. Реализуйте метод, который будет возвращать площадь этого
        треугольника. Создайте несколько объектов этого класса и протестируйте их.
*/

package HW01.Task02;

public class MainHW01Task02 {
    public static void main(String[] args) {
        Triangle triangleOne = new Triangle("One",5, 3, 7);
        Triangle triangleTwo = new Triangle("Two",4, 8, 6);
        Triangle triangleThree = new Triangle("Three",10, 2, 9);

        System.out.printf("Triangle area - %.2f%n %s%n", triangleOne.triangleArea(), triangleOne);
        System.out.printf("Triangle area - %.2f%n %s%n", triangleTwo.triangleArea(), triangleTwo);
        System.out.printf("Triangle area - %.2f%n %s%n", triangleThree.triangleArea(), triangleThree);


    }
}
