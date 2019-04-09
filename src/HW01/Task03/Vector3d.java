/**
 * Java OOP. Home Work 01.
 *
 * @author Oleg Khrulov
 * @version dated 09.04.2019
 */

/*
        Описать класс «Vector3d» (т. е., он должен описывать вектор в трехмерной,
        декартовой системе координат). В качестве свойств этого класса возьмите
        координаты вектора. Для этого класса реализовать методы сложения, скалярного и
        векторного произведения векторов. Создайте несколько объектов этого класса и
        протестируйте их.
*/

package HW01.Task03;

public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d() {
    }

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3d {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public static Vector3d sumOfVector(Vector3d vectorOne, Vector3d vectorTwo){
        double x = vectorOne.getX() + vectorTwo.getX();
        double y = vectorOne.getY() + vectorTwo.getY();
        double z = vectorOne.getZ() + vectorTwo.getZ();

        return new Vector3d(x, y, z);
    }

    public static double scalarProductOfVector(Vector3d vectorOne, Vector3d vectorTwo) {
        double scalarProduct
                = (vectorOne.getX() * vectorTwo.getX())
                + (vectorOne.getY() * vectorTwo.getY())
                + (vectorOne.getZ() * vectorTwo.getZ());

        return scalarProduct;
    }

    public static Vector3d vectorProductOfVector(Vector3d vectorOne, Vector3d vectorTwo) {
        Vector3d vectorProductOfVector = new Vector3d(
                (vectorOne.getY() * vectorTwo.getZ() - vectorOne.getZ() * vectorTwo.getX()),
                (vectorOne.getZ() * vectorTwo.getX() - vectorOne.getX() * vectorTwo.getZ()),
                (vectorOne.getZ() * vectorTwo.getX() - vectorOne.getX() * vectorTwo.getZ()));

        return vectorProductOfVector;
    }

}
