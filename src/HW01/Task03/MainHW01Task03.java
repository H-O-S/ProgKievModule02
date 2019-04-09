/**
 * Java OOP. Home Work 01.
 *
 * @author Oleg Khrulov
 * @version dated 09.04.2019
 */

package HW01.Task03;

public class MainHW01Task03 {
    public static void main(String[] args) {
        Vector3d vectorOne = new Vector3d(3.4, 5.2, 7.8);
        Vector3d vectorTwo = new Vector3d(9.1, 3.7, 1.5);

        System.out.println( "Sum Of Vector: " + Vector3d.sumOfVector(vectorOne, vectorTwo));
        System.out.println( "Scalar Product Of Vector: " + Vector3d.scalarProductOfVector(vectorOne, vectorTwo));
        System.out.println( "Vector Product Of Vector: " + Vector3d.vectorProductOfVector(vectorOne, vectorTwo));
    }
}
