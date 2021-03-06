/**
 * Java OOP. Home Work 02.
 *
 * @author Oleg Khrulov
 * @version dated 16.04.2019
 */

/*
        1. Создайте абстрактный класс Shape, в котором есть два
        абстрактных метода double getPerimetr() и double getArea().
        2. Создайте класс Point, в котором есть два свойства double x
        double y.
        3. Создайте классы, которые описывают, как минимум, три
        геометрические фигуры (они должны быть подклассами
        Shape). При этом они в качестве свойств должны содержать
        классы Point.
        4. Создайте класс доска. Доска поделена на 4 части в каждую
        часть доски можно положить одну из фигур. У доски должны
        быть методы которые помещают и удаляют фигуру с доски.
        Также должен быть метод который выводит информацию о
        всех фигурах лежащих на доске и их суммарную площадь.
        5. * Нарисуйте UML диаграмму проекта.
*/

package HW02;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
