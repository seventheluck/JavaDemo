package filesAndIo.characterStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterClasses {

    public static void main(String[] args) {
        File file = new File("/Users/petter/test/testPrintWriter.txt");
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.print("This is a test for PrintWriter!");
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

