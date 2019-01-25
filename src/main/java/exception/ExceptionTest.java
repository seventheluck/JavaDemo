package exception;

import java.io.IOException;
import java.util.Hashtable;

public class ExceptionTest {

    public static void main(String[] args) throws Exception {
        try {
            int a = 0;
            a++;
            a = a | 1;
            if (a == 1)
                return;
            System.out.println("try");

        } catch (Exception e) {
            System.out.println("cathch exception");
            throw new Exception("sldjlksdjkjslkdfj");
        } finally {
            System.out.println("finally");
        }
    }
}
