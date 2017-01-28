package Functional_Interface;

/**
 * Created by shan on 1/28/17.
 */
public class Main implements MyI {


    @Override
    public void write(String s) {

    }

    @Override
    public void write2(String s) {
        System.out.println("from overrided write2 " + s);
    }

    public static void main(String[] args) {

        MyI my = (String s) -> System.out.println("hello , " + s);
        my.write("shan");
        my.write2("chamath");
        new Main().write2("Kalana");
        MyI.write3("Pasindu");


    }
}

@FunctionalInterface
interface MyI {
    void write(String s);

    default void write2(String s) {
        System.out.println("from default " + s);
    }

    static void write3(String s) {
        System.out.println("from static " + s);
    }
}
