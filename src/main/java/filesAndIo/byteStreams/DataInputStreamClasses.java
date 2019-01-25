package filesAndIo.byteStreams;

import java.io.*;

public class DataInputStreamClasses {

    public static void main(String[] args) {
        File file = new File("/Users/petter/test/testDataInputStream.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readInt());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
