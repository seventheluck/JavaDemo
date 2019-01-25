package filesAndIo.byteStreams;

import java.io.*;

public class BufferedInputStreamClasses {
    public static void main(String[] args) {
        File file = new File("/Users/petter/test/test.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedInputStream bis = new BufferedInputStream(fis);
        try {
            int c = bis.read();
            while (c != -1) {
                System.out.print((char) c);
                c = bis.read();
            }
            fis.close();
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
