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

public class Triangle extends Shape {
    private Point pointOne;
    private Point pointTwo;
    private Point pointThree;

    public Triangle(Point pointOne, Point pointTwo, Point pointThree) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThree = pointThree;
    }

    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    public Point getPointThree() {
        return pointThree;
    }

    public void setPointThree(Point pointThree) {
        this.pointThree = pointThree;
    }

    @Override
    double getPerimetr() {
        return 0;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointOne=" + pointOne +
                ", pointTwo=" + pointTwo +
                ", pointThree=" + pointThree +
                '}';
    }
}
