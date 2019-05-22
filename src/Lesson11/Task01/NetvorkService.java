package Lesson11.Task01;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class NetvorkService {
    public static String getStringFromURL(String url, String code) throws IOException{
        String result = "";
        URL urlCon = new URL(url); // устанавливаем соединение
        HttpURLConnection connection = (HttpURLConnection) urlCon.openConnection();
        try (InputStream is = connection.getInputStream()){
            BufferedReader br = new BufferedReader(new InputStreamReader( is, code));
            String temp = "";
            for (;(temp = br.readLine()) != null;){
                result += temp + System.lineSeparator();
            }
        } catch (IOException e) {
            throw e;
        }

        return result;
    }

    public static void saveResourceToFolder(String url, File folder) throws IOException{
        URL urlCon = new URL(url); // устанавливаем соединение
        HttpURLConnection connection = (HttpURLConnection) urlCon.openConnection();
        int n = url.lastIndexOf("/");
        String fileName = url.substring(n + 1);
        File file = new File(folder, fileName);
        try (InputStream is = connection.getInputStream();
            OutputStream os = new FileOutputStream(file)){
            long loadBytes = 0;
                byte [] buffer = new byte[1024*1024];
                int readByte = 0;
                for (;(readByte = is.read(buffer)) > 0;) {
                    loadBytes += readByte;
                    os.write(buffer, 0, readByte);
                    System.out.println(loadBytes);
            }
        } catch (IOException e) {
            throw  e;
        }
    }

    public static Map<String, List<String>> getHeadersFromURL(String url) throws IOException{
        URL urlCon = new URL(url); // устанавливаем соединение
        HttpURLConnection connection = (HttpURLConnection) urlCon.openConnection();
        return connection.getHeaderFields();
    }
}
