/**
 * Java OOP. Home Work 01.
 *
 * @author Oleg Khrulov
 * @version dated 08.04.2019
 */

/*
        Описать класс «Triangle». В качестве свойств возьмите длины сторон
        треугольника. Реализуйте метод, который будет возвращать площадь этого
        треугольника. Создайте несколько объектов этого класса и протестируйте их.
*/

package HW01.Task02;

public class Triangle {
    private String name;
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(String name, double sideOne, double sideTwo, double sideThree) {
        this.name = name;
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public double triangleArea (){
        double semiPerimeter = (sideOne + sideTwo + sideThree) / 2;
        double triangleArea = Math.sqrt(semiPerimeter *
                (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) + (semiPerimeter - sideThree));

        return triangleArea;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                ", sideThree=" + sideThree +
                '}';
    }
}
