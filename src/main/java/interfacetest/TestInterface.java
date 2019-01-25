package interfacetest;

public interface TestInterface {

    public int sub();
    public default int add() {
        return 1;
    }

    public static int minus() {
        return 2;
    }
}


abstract class test implements TestInterface{
}

class test2 extends test {

    @Override
    public int sub() {
        return 0;
    }

    @Override
    public int add() {
        return 0;
    }
}