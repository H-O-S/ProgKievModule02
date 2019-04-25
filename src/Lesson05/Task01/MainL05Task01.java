/**
 * Java OOP. Lesson 05.
 *
 * @author Oleg Khrulov
 * @version dated 23.04.2019
 */


package Lesson05.Task01;

import java.io.File;
import java.io.IOException;

public class MainL05Task01 {
    public static void main(String[] args) {
        File fis = new File(
                "e:/HOS/OneDrive/DOC_MY/САМОРАЗВИТИЕ/IT/Java/ProgKiev/CoursePresentations/Module-02/123.pdf");
        File fos = new File("book.pdf");

        try {
            IOStream.fileCopy(fis, fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
