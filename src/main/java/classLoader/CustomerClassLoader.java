package classLoader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomerClassLoader extends ClassLoader {
    private String path;
    private String name;

    public CustomerClassLoader(String path, String name) {
        super();
        this.path = path;
        this.name = name;
    }

    public CustomerClassLoader(String path, String name, ClassLoader parent) {
        super(parent);
        this.path = path;
        this.name = name;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classByteData = getClassFileByte(name);
        Class<?> classData = null;
        if (classByteData == null || classByteData.length == 0) {
            try {
                classData = super.defineClass(name, classByteData, 0, classByteData.length);
            } catch (Exception e) {
                throw new ClassNotFoundException();
            }
        } else {
            throw new ClassNotFoundException();

        }
        return classData;
    }

    private byte[] getClassFileByte(String name) {

        try {
            FileInputStream fis = new FileInputStream(name);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
