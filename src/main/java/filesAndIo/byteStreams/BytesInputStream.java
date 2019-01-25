package filesAndIo.byteStreams;

import java.io.*;

public class BytesInputStream {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/petter/test/test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileInputStream fileInputStream1 = new FileInputStream("/Users/petter/test/test.txt");
        int available = fileInputStream1.available();
        System.out.println(available);
        byte[] result = new byte[available];
        fileInputStream1.read(result);
        fileInputStream1.close();
        String str = new String(result);
        System.out.println("======================");
        System.out.println(str);
    }
}
