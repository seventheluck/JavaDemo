package filesAndIo.byteStreams;

import java.io.*;

public class BufferedOutputStreamClasses {

    public static void main(String[] args) {
        File file = new File("/Users/petter/test/testBufferedOutputStream.txt");
        FileOutputStream fos = null;
        String str = "I want to write something to the file by using BufferedOutputStream!";
        byte[] bytes = str.getBytes();
        try {
            fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(bytes);
            bos.flush();
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
