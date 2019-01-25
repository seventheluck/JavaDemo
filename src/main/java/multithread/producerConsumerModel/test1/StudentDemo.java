package multithread.producerConsumerModel.test1;

/**
 * Entity: Student
 * Set value: SetThread
 * Get value: GetThread
 * Test: StudentDemo
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        SetThread st = new SetThread(s);
        GetThread gt = new GetThread(s);

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(gt);

        t1.start();
        t2.start();
    }
}
