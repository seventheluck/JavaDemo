package classLoader;

import com.sun.javafx.util.Logging;

public class LearningClassLoader {
    public static void main(String[] args) {
        
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(LearningClassLoader.class.getClassLoader());
        System.out.println(Logging.class.getClassLoader());
        System.out.println(ClassLoader.class.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }
}