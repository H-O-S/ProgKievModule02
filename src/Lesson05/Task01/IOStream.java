package Lesson05.Task01;

import java.io.*;

public class IOStream {

    public static void streamCopy(InputStream is, OutputStream os) throws IOException {
        if (is == null || os == null){
            throw new IllegalArgumentException();
        }
        byte[] buffer = new byte[1024 * 1024];
        int readByte = 0;
        for (; (readByte = is.read(buffer)) > 0;){
            os.write(buffer, 0, readByte);
        }
    }

    public static void fileCopy(File fis, File fos) throws IOException{
        if (fis == null || fos == null){
            throw new IllegalArgumentException();
        }
        try (InputStream is = new FileInputStream(fis);
                OutputStream os = new FileOutputStream(fos)){
            streamCopy(is, os);

        }catch (IOException e){
            throw e;
        }
    }
}
