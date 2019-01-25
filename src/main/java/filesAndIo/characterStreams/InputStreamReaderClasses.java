package filesAndIo.characterStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderClasses {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/petter/test/testInputStreamReader.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            int c = isr.read();
            while (c != -1) {
                System.out.print((char) c);
                c = isr.read();
            }
            fis.close();
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
