/**
 * Java OOP. Lesson 11.
 *
 * @author Oleg Khrulov
 * @version dated 21.05.2019
 */

/*
*
*
*
*/

package Lesson11.Task01;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MainL11Task01 {
    public static void main(String[] args) {

//        1). Выгружает заголовок страницы
//        String url = "https://prog.kiev.ua/forum/index.php/topic,4211.90.html";
//
//        Map<String, List<String>> headers = null;
//
//        try {
//            headers = NetvorkService.getHeadersFromURL(url);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        headers.forEach((key, value) -> System.out.println(key + " => " + value));


//        2). Выгружает страницу
        String url = "https://prog.kiev.ua/forum/index.php/topic,4211.90.html";

        String text = "";

        try {
            text = NetvorkService.getStringFromURL(url, "UTF-8");
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(text);


//        3). Выгружает файл
//        String url = "https://prog.kiev.ua/images/logo100.png";
//        File folder = new File("LOCAL_CASH");
//        folder.mkdir();
//
//        try {
//            NetvorkService.saveResourceToFolder(url, folder);
//            System.out.println("Done!");
//        } catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
