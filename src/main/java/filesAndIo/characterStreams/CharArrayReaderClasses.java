package filesAndIo.characterStreams;

import java.io.CharArrayReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharArrayReaderClasses {

    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd'};
        CharArrayReader car = new CharArrayReader(chars);
        try {
            int c = car.read();
            while (c != -1) {
                System.out.print((char) c);
                c = car.read();
            }
            car.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
