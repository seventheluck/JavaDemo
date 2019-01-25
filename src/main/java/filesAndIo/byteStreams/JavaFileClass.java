package filesAndIo.byteStreams;

import java.io.File;
import java.util.Scanner;

public class JavaFileClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String filePath = "";
        filePath = in.nextLine().trim();

        File file = new File(filePath);
        if (file.isDirectory()) {
            System.out.println(countFile(file, ".java"));
        } else {
            System.out.println(file.getAbsolutePath() + " is not a dir");
        }
    }

    private static int countFile(File file, String extension) {
        File children[] = file.listFiles();
        int count = 0;
        for (int i = 0; i < children.length; i++) {
            System.out.println(children[i].getName());
            count++;
        }
        return count;
    }
}
