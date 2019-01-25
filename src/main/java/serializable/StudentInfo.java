package serializable;

import javax.management.ObjectInstance;
import java.io.*;

public class StudentInfo implements Serializable {

    private String name;
    private transient int age;

    public StudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StudentInfo studentInfo = new StudentInfo("abc", 10);
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("student"));
        o.writeObject(studentInfo);
        o.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student"));
        StudentInfo studentInfo1 = (StudentInfo) in.readObject();
    }
}