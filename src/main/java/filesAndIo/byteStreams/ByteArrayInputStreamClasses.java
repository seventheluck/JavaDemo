package filesAndIo.byteStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamClasses {
    public static void main(String[] args) {
        String str = "This is a test for ByteArrayInputStream.";
        byte[] result = str.getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(result);
        int c = bis.read();
        while (c != -1) {
            System.out.print((char) c);
            c = bis.read();
        }
        try {
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
