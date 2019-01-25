package filesAndIo.characterStreams;

import java.io.Console;

public class ConsoleClasses {

    public static void main(String[] args) {
        System.out.print("***************");
        Console c = System.console();
        c.format("Hello, I am Console!");

    }
}
