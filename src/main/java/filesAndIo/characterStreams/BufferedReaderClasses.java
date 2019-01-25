package filesAndIo.characterStreams;

import java.io.*;

public class BufferedReaderClasses {

    public static void main(String[] args) {
        File file = new File("/Users/petter/test/testFileWriter.txt");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int c = br.read();
            while (c != -1) {
                System.out.print((char) c);
                c = br.read();
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
